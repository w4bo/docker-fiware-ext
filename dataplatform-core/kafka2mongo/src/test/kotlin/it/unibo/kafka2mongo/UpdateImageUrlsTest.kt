package it.unibo.kafka2mongo

import org.json.JSONObject
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals


class UpdateImageUrlsTest {

    @Test
    fun `test updateImageUrls updates image URLs`() {

        // Sample JSON for testing
        val jsonString = """
            {
                "id": "urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7",
                "type": "Camera",
                "cameraName": "DroneCam",
                "dateCreated": "2022-09-07T12:05:51.000Z",
                "description": "5mt altitude photo with orientation NS",
                "domain": "cnr",
                "imageSnapshot": "http://137.204.70.156:41080/cnr/data/5mt_NS/DJI_0220.JPG",
                "timestamp_subscription": 1720000452220,
                "location": {
                    "type": "Point",
                    "coordinates": [
                        11.908238444,
                        44.878494556
                    ]
                },
                "exampleArray": [
                    "http://137.204.70.156:41080/cnr/data/5mt_NS/DJI_0220.png",
                    "http://137.204.70.156:41080/cnr/data/5mt_NS/DJI_0221.PNG",
                ],
                "exampleObjectArray": [
                    {
                        "image": "http://137.204.70.156:41080/cnr/data/5mt_NS/DJI_0220.JPG"
                    },
                    {
                        "image": "http://137.204.70.156:41080/cnr/data/5mt_NS/DJI_0221.JPG"
                    }
                ],
                "namespace": "cnr."
            }
        """

        val jsonObject = JSONObject(jsonString)

        // Run the updateImageUrls function
        val updatedJson = updateImageUrls(jsonObject)

        // Validate the result
        val updatedJsonString = updatedJson.toString(2)

        // Expected output after substitution
        val expectedJsonString = JSONObject("""
            {
                "id": "urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7",
                "type": "Camera",
                "cameraName": "DroneCam",
                "dateCreated": "2022-09-07T12:05:51.000Z",
                "description": "5mt altitude photo with orientation NS",
                "domain": "cnr",
                "timestamp_subscription": 1720000452220,
                "location": {
                    "type": "Point",
                    "coordinates": [
                        11.908238444,
                        44.878494556
                    ]
                },
                "imageSnapshot": "null://null:null/image-archive/cnr/urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7/2024-07-03/2024-07-03-11-54-12-220+0200_urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7_imageSnapshot.jpg",
                "exampleObjectArray": [
                    {"image": "null://null:null/image-archive/cnr/urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7/2024-07-03/2024-07-03-11-54-12-220+0200_urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7_exampleObjectArray_0_image.jpg"},
                    {"image": "null://null:null/image-archive/cnr/urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7/2024-07-03/2024-07-03-11-54-12-220+0200_urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7_exampleObjectArray_1_image.jpg"}
                ],
                "exampleArray": [
                    "null://null:null/image-archive/cnr/urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7/2024-07-03/2024-07-03-11-54-12-220+0200_urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7_exampleArray_0.png",
                    "null://null:null/image-archive/cnr/urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7/2024-07-03/2024-07-03-11-54-12-220+0200_urn:ngsi-ld:Camera:cnr:32cde24e-3f00-4623-bb4a-1e6e0824eeb7_exampleArray_1.png"
                ],
                "namespace": "cnr."
            }
        """).toString(2)

        assertEquals(expectedJsonString, updatedJsonString)
    }
}
