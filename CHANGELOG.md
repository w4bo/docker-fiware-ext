## [1.1.1](https://github.com/alexbaiardi/docker-fiware-ext/compare/1.1.0...1.1.1) (2025-01-21)

### Bug Fixes

* add file path support as image attribute using the filserver to download  ([#218](https://github.com/alexbaiardi/docker-fiware-ext/issues/218)) ([7c60baa](https://github.com/alexbaiardi/docker-fiware-ext/commit/7c60baaf47676e46620f63ae4c2c2abbb48bf0f1))
* integrate persist images ([83fae7d](https://github.com/alexbaiardi/docker-fiware-ext/commit/83fae7d5fffd3caee1019b898c43b10dd25e4143))

## [1.1.0](https://github.com/alexbaiardi/docker-fiware-ext/compare/1.0.3...1.1.0) (2025-01-20)

### Features

* add persistence of image from path instead url using the fileserver address ([0a9823c](https://github.com/alexbaiardi/docker-fiware-ext/commit/0a9823c0fc95d9460cf1ee717c58b26d3207d771))

### Dependency updates

* **deps:** update dependency gradle to v8.10.2 ([#215](https://github.com/alexbaiardi/docker-fiware-ext/issues/215)) ([4c23710](https://github.com/alexbaiardi/docker-fiware-ext/commit/4c237105f659513dc8e57b0af25e2dabf431e89e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.117 ([#201](https://github.com/alexbaiardi/docker-fiware-ext/issues/201)) ([e73b704](https://github.com/alexbaiardi/docker-fiware-ext/commit/e73b70441fb2ec4d5686329e2bd898eef74bc332))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.118 ([#204](https://github.com/alexbaiardi/docker-fiware-ext/issues/204)) ([f2c3ce7](https://github.com/alexbaiardi/docker-fiware-ext/commit/f2c3ce7c75a79bc2eefbe9bd3ddd4c1463e79012))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.119 ([#211](https://github.com/alexbaiardi/docker-fiware-ext/issues/211)) ([d4ad7f6](https://github.com/alexbaiardi/docker-fiware-ext/commit/d4ad7f6b2247e4bfcec4d568451c291dfb490ba0))
* **deps:** update dependency urllib3 to v2.3.0 ([#202](https://github.com/alexbaiardi/docker-fiware-ext/issues/202)) ([24068ae](https://github.com/alexbaiardi/docker-fiware-ext/commit/24068aef917645a9919ef4d085246b75f3c51016))
* **deps:** update node.js to 22.13 ([#205](https://github.com/alexbaiardi/docker-fiware-ext/issues/205)) ([0d32c69](https://github.com/alexbaiardi/docker-fiware-ext/commit/0d32c69f850b9e3bfbb0bc1e45e1c2907f88c5de))

### Bug Fixes

* add storage of current state enriched entities and persist images service ([#212](https://github.com/alexbaiardi/docker-fiware-ext/issues/212)) ([a41b7f2](https://github.com/alexbaiardi/docker-fiware-ext/commit/a41b7f23adb2032c502a902d4ec71f30b3a5e2cb))
* **deps:** update dependency org.json:json to v20241224 ([#203](https://github.com/alexbaiardi/docker-fiware-ext/issues/203)) ([195b88e](https://github.com/alexbaiardi/docker-fiware-ext/commit/195b88ed35f185435b306e8b070a1037660f4a69))
* **deps:** update dependency org.json:json to v20250107 ([#206](https://github.com/alexbaiardi/docker-fiware-ext/issues/206)) ([2d2fbd8](https://github.com/alexbaiardi/docker-fiware-ext/commit/2d2fbd8edcae825d95542fe886a043380365bd3c))

### Build and continuous integration

* add persist-images docker image release ([83d1547](https://github.com/alexbaiardi/docker-fiware-ext/commit/83d1547f39f179995154ad394b93515ca3af3269))
* **deps:** update docker/build-push-action digest to 31ca4e5 ([#208](https://github.com/alexbaiardi/docker-fiware-ext/issues/208)) ([873db41](https://github.com/alexbaiardi/docker-fiware-ext/commit/873db41e4b1bb4569913f9c15772ea5b7f7c7041))
* **deps:** update docker/build-push-action digest to 67a2d40 ([#213](https://github.com/alexbaiardi/docker-fiware-ext/issues/213)) ([9edd9a3](https://github.com/alexbaiardi/docker-fiware-ext/commit/9edd9a3a23f8d1a4eb4dfe15df87b00234c6e998))
* **deps:** update docker/build-push-action digest to 7e09459 ([#200](https://github.com/alexbaiardi/docker-fiware-ext/issues/200)) ([fb71431](https://github.com/alexbaiardi/docker-fiware-ext/commit/fb7143139919352eb27e0c8e3ee725c8b7645f5a))
* **deps:** update docker/build-push-action digest to b32b51a ([#207](https://github.com/alexbaiardi/docker-fiware-ext/issues/207)) ([7c740e4](https://github.com/alexbaiardi/docker-fiware-ext/commit/7c740e4dd39119a98993ade551b20dcb851d48eb))
* **deps:** update docker/login-action digest to 327cd5a ([#209](https://github.com/alexbaiardi/docker-fiware-ext/issues/209)) ([60d2bc8](https://github.com/alexbaiardi/docker-fiware-ext/commit/60d2bc8d9fa035fd4b076b4fc3cc2da70ed6c7f8))
* **deps:** update docker/metadata-action digest to 8e1d546 ([#210](https://github.com/alexbaiardi/docker-fiware-ext/issues/210)) ([37b8175](https://github.com/alexbaiardi/docker-fiware-ext/commit/37b8175ebc6798b3253509ecb6eb4956c3ec2088))
* update docker local file ([61e9472](https://github.com/alexbaiardi/docker-fiware-ext/commit/61e94728b44c2035cd297f408601ede1fd902e09))

### General maintenance

* **release:** 1.0.27 [skip ci] ([dd6012a](https://github.com/alexbaiardi/docker-fiware-ext/commit/dd6012a937bc53cddd8108b9cb0ff00125e267cf)), closes [#201](https://github.com/alexbaiardi/docker-fiware-ext/issues/201) [#202](https://github.com/alexbaiardi/docker-fiware-ext/issues/202) [#203](https://github.com/alexbaiardi/docker-fiware-ext/issues/203) [#200](https://github.com/alexbaiardi/docker-fiware-ext/issues/200)
* **release:** 1.0.28 [skip ci] ([aa4746d](https://github.com/alexbaiardi/docker-fiware-ext/commit/aa4746df19a1b84e7f45d56aa35200c7fbce5dca)), closes [#204](https://github.com/alexbaiardi/docker-fiware-ext/issues/204) [#205](https://github.com/alexbaiardi/docker-fiware-ext/issues/205) [#206](https://github.com/alexbaiardi/docker-fiware-ext/issues/206)
* **release:** 1.0.29 [skip ci] ([e491b05](https://github.com/alexbaiardi/docker-fiware-ext/commit/e491b05e8b23d4b1e712ac0e771dca6130c0da11)), closes [#211](https://github.com/alexbaiardi/docker-fiware-ext/issues/211) [#212](https://github.com/alexbaiardi/docker-fiware-ext/issues/212) [#208](https://github.com/alexbaiardi/docker-fiware-ext/issues/208) [#207](https://github.com/alexbaiardi/docker-fiware-ext/issues/207) [#209](https://github.com/alexbaiardi/docker-fiware-ext/issues/209) [#210](https://github.com/alexbaiardi/docker-fiware-ext/issues/210)
* **release:** 1.0.4 [skip ci] ([4414291](https://github.com/alexbaiardi/docker-fiware-ext/commit/441429164901113d013a2ed21294e89a0327c0bc)), closes [#215](https://github.com/alexbaiardi/docker-fiware-ext/issues/215) [#201](https://github.com/alexbaiardi/docker-fiware-ext/issues/201) [#204](https://github.com/alexbaiardi/docker-fiware-ext/issues/204) [#211](https://github.com/alexbaiardi/docker-fiware-ext/issues/211) [#202](https://github.com/alexbaiardi/docker-fiware-ext/issues/202) [#205](https://github.com/alexbaiardi/docker-fiware-ext/issues/205) [#212](https://github.com/alexbaiardi/docker-fiware-ext/issues/212) [#203](https://github.com/alexbaiardi/docker-fiware-ext/issues/203) [#206](https://github.com/alexbaiardi/docker-fiware-ext/issues/206) [#208](https://github.com/alexbaiardi/docker-fiware-ext/issues/208) [#213](https://github.com/alexbaiardi/docker-fiware-ext/issues/213) [#200](https://github.com/alexbaiardi/docker-fiware-ext/issues/200) [#207](https://github.com/alexbaiardi/docker-fiware-ext/issues/207) [#209](https://github.com/alexbaiardi/docker-fiware-ext/issues/209) [#210](https://github.com/alexbaiardi/docker-fiware-ext/issues/210) [#201](https://github.com/alexbaiardi/docker-fiware-ext/issues/201) [#202](https://github.com/alexbaiardi/docker-fiware-ext/issues/202) [#203](https://github.com/alexbaiardi/docker-fiware-ext/issues/203) [#200](https://github.com/alexbaiardi/docker-fiware-ext/issues/200) [#204](https://github.com/alexbaiardi/docker-fiware-ext/issues/204) [#205](https://github.com/alexbaiardi/docker-fiware-ext/issues/205) [#206](https://github.com/alexbaiardi/docker-fiware-ext/issues/206) [#211](https://github.com/alexbaiardi/docker-fiware-ext/issues/211) [#212](https://github.com/alexbaiardi/docker-fiware-ext/issues/212) [#208](https://github.com/alexbaiardi/docker-fiware-ext/issues/208) [#207](https://github.com/alexbaiardi/docker-fiware-ext/issues/207) [#209](https://github.com/alexbaiardi/docker-fiware-ext/issues/209) [#210](https://github.com/alexbaiardi/docker-fiware-ext/issues/210)
* update stack ([433516f](https://github.com/alexbaiardi/docker-fiware-ext/commit/433516fa78086208ee5bd68539bd82234d07a9af))

### Refactoring

* semplified persist image test ([27ffd71](https://github.com/alexbaiardi/docker-fiware-ext/commit/27ffd719f5500e3fee73c8277a5121799d5743fe))

## [1.0.4](https://github.com/alexbaiardi/docker-fiware-ext/compare/1.0.3...1.0.4) (2025-01-20)

### Dependency updates

* **deps:** update dependency gradle to v8.10.2 ([#215](https://github.com/alexbaiardi/docker-fiware-ext/issues/215)) ([4c23710](https://github.com/alexbaiardi/docker-fiware-ext/commit/4c237105f659513dc8e57b0af25e2dabf431e89e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.117 ([#201](https://github.com/alexbaiardi/docker-fiware-ext/issues/201)) ([e73b704](https://github.com/alexbaiardi/docker-fiware-ext/commit/e73b70441fb2ec4d5686329e2bd898eef74bc332))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.118 ([#204](https://github.com/alexbaiardi/docker-fiware-ext/issues/204)) ([f2c3ce7](https://github.com/alexbaiardi/docker-fiware-ext/commit/f2c3ce7c75a79bc2eefbe9bd3ddd4c1463e79012))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.119 ([#211](https://github.com/alexbaiardi/docker-fiware-ext/issues/211)) ([d4ad7f6](https://github.com/alexbaiardi/docker-fiware-ext/commit/d4ad7f6b2247e4bfcec4d568451c291dfb490ba0))
* **deps:** update dependency urllib3 to v2.3.0 ([#202](https://github.com/alexbaiardi/docker-fiware-ext/issues/202)) ([24068ae](https://github.com/alexbaiardi/docker-fiware-ext/commit/24068aef917645a9919ef4d085246b75f3c51016))
* **deps:** update node.js to 22.13 ([#205](https://github.com/alexbaiardi/docker-fiware-ext/issues/205)) ([0d32c69](https://github.com/alexbaiardi/docker-fiware-ext/commit/0d32c69f850b9e3bfbb0bc1e45e1c2907f88c5de))

### Bug Fixes

* add storage of current state enriched entities and persist images service ([#212](https://github.com/alexbaiardi/docker-fiware-ext/issues/212)) ([a41b7f2](https://github.com/alexbaiardi/docker-fiware-ext/commit/a41b7f23adb2032c502a902d4ec71f30b3a5e2cb))
* **deps:** update dependency org.json:json to v20241224 ([#203](https://github.com/alexbaiardi/docker-fiware-ext/issues/203)) ([195b88e](https://github.com/alexbaiardi/docker-fiware-ext/commit/195b88ed35f185435b306e8b070a1037660f4a69))
* **deps:** update dependency org.json:json to v20250107 ([#206](https://github.com/alexbaiardi/docker-fiware-ext/issues/206)) ([2d2fbd8](https://github.com/alexbaiardi/docker-fiware-ext/commit/2d2fbd8edcae825d95542fe886a043380365bd3c))

### Build and continuous integration

* add persist-images docker image release ([83d1547](https://github.com/alexbaiardi/docker-fiware-ext/commit/83d1547f39f179995154ad394b93515ca3af3269))
* **deps:** update docker/build-push-action digest to 31ca4e5 ([#208](https://github.com/alexbaiardi/docker-fiware-ext/issues/208)) ([873db41](https://github.com/alexbaiardi/docker-fiware-ext/commit/873db41e4b1bb4569913f9c15772ea5b7f7c7041))
* **deps:** update docker/build-push-action digest to 67a2d40 ([#213](https://github.com/alexbaiardi/docker-fiware-ext/issues/213)) ([9edd9a3](https://github.com/alexbaiardi/docker-fiware-ext/commit/9edd9a3a23f8d1a4eb4dfe15df87b00234c6e998))
* **deps:** update docker/build-push-action digest to 7e09459 ([#200](https://github.com/alexbaiardi/docker-fiware-ext/issues/200)) ([fb71431](https://github.com/alexbaiardi/docker-fiware-ext/commit/fb7143139919352eb27e0c8e3ee725c8b7645f5a))
* **deps:** update docker/build-push-action digest to b32b51a ([#207](https://github.com/alexbaiardi/docker-fiware-ext/issues/207)) ([7c740e4](https://github.com/alexbaiardi/docker-fiware-ext/commit/7c740e4dd39119a98993ade551b20dcb851d48eb))
* **deps:** update docker/login-action digest to 327cd5a ([#209](https://github.com/alexbaiardi/docker-fiware-ext/issues/209)) ([60d2bc8](https://github.com/alexbaiardi/docker-fiware-ext/commit/60d2bc8d9fa035fd4b076b4fc3cc2da70ed6c7f8))
* **deps:** update docker/metadata-action digest to 8e1d546 ([#210](https://github.com/alexbaiardi/docker-fiware-ext/issues/210)) ([37b8175](https://github.com/alexbaiardi/docker-fiware-ext/commit/37b8175ebc6798b3253509ecb6eb4956c3ec2088))
* update docker local file ([61e9472](https://github.com/alexbaiardi/docker-fiware-ext/commit/61e94728b44c2035cd297f408601ede1fd902e09))

### General maintenance

* **release:** 1.0.27 [skip ci] ([dd6012a](https://github.com/alexbaiardi/docker-fiware-ext/commit/dd6012a937bc53cddd8108b9cb0ff00125e267cf)), closes [#201](https://github.com/alexbaiardi/docker-fiware-ext/issues/201) [#202](https://github.com/alexbaiardi/docker-fiware-ext/issues/202) [#203](https://github.com/alexbaiardi/docker-fiware-ext/issues/203) [#200](https://github.com/alexbaiardi/docker-fiware-ext/issues/200)
* **release:** 1.0.28 [skip ci] ([aa4746d](https://github.com/alexbaiardi/docker-fiware-ext/commit/aa4746df19a1b84e7f45d56aa35200c7fbce5dca)), closes [#204](https://github.com/alexbaiardi/docker-fiware-ext/issues/204) [#205](https://github.com/alexbaiardi/docker-fiware-ext/issues/205) [#206](https://github.com/alexbaiardi/docker-fiware-ext/issues/206)
* **release:** 1.0.29 [skip ci] ([e491b05](https://github.com/alexbaiardi/docker-fiware-ext/commit/e491b05e8b23d4b1e712ac0e771dca6130c0da11)), closes [#211](https://github.com/alexbaiardi/docker-fiware-ext/issues/211) [#212](https://github.com/alexbaiardi/docker-fiware-ext/issues/212) [#208](https://github.com/alexbaiardi/docker-fiware-ext/issues/208) [#207](https://github.com/alexbaiardi/docker-fiware-ext/issues/207) [#209](https://github.com/alexbaiardi/docker-fiware-ext/issues/209) [#210](https://github.com/alexbaiardi/docker-fiware-ext/issues/210)
* update stack ([433516f](https://github.com/alexbaiardi/docker-fiware-ext/commit/433516fa78086208ee5bd68539bd82234d07a9af))

### Refactoring

* semplified persist image test ([27ffd71](https://github.com/alexbaiardi/docker-fiware-ext/commit/27ffd719f5500e3fee73c8277a5121799d5743fe))

## [1.0.29](https://github.com/w4bo/docker-fiware-ext/compare/1.0.28...1.0.29) (2025-01-13)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.119 ([#211](https://github.com/w4bo/docker-fiware-ext/issues/211)) ([d4ad7f6](https://github.com/w4bo/docker-fiware-ext/commit/d4ad7f6b2247e4bfcec4d568451c291dfb490ba0))

### Bug Fixes

* add storage of current state enriched entities and persist images service ([#212](https://github.com/w4bo/docker-fiware-ext/issues/212)) ([a41b7f2](https://github.com/w4bo/docker-fiware-ext/commit/a41b7f23adb2032c502a902d4ec71f30b3a5e2cb))

### Build and continuous integration

* **deps:** update docker/build-push-action digest to 31ca4e5 ([#208](https://github.com/w4bo/docker-fiware-ext/issues/208)) ([873db41](https://github.com/w4bo/docker-fiware-ext/commit/873db41e4b1bb4569913f9c15772ea5b7f7c7041))
* **deps:** update docker/build-push-action digest to b32b51a ([#207](https://github.com/w4bo/docker-fiware-ext/issues/207)) ([7c740e4](https://github.com/w4bo/docker-fiware-ext/commit/7c740e4dd39119a98993ade551b20dcb851d48eb))
* **deps:** update docker/login-action digest to 327cd5a ([#209](https://github.com/w4bo/docker-fiware-ext/issues/209)) ([60d2bc8](https://github.com/w4bo/docker-fiware-ext/commit/60d2bc8d9fa035fd4b076b4fc3cc2da70ed6c7f8))
* **deps:** update docker/metadata-action digest to 8e1d546 ([#210](https://github.com/w4bo/docker-fiware-ext/issues/210)) ([37b8175](https://github.com/w4bo/docker-fiware-ext/commit/37b8175ebc6798b3253509ecb6eb4956c3ec2088))

## [1.0.4](https://github.com/alexbaiardi/docker-fiware-ext/compare/1.0.3...1.0.4) (2025-01-10)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.117 ([#201](https://github.com/alexbaiardi/docker-fiware-ext/issues/201)) ([e73b704](https://github.com/alexbaiardi/docker-fiware-ext/commit/e73b70441fb2ec4d5686329e2bd898eef74bc332))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.118 ([#204](https://github.com/alexbaiardi/docker-fiware-ext/issues/204)) ([f2c3ce7](https://github.com/alexbaiardi/docker-fiware-ext/commit/f2c3ce7c75a79bc2eefbe9bd3ddd4c1463e79012))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.119 ([#211](https://github.com/alexbaiardi/docker-fiware-ext/issues/211)) ([d4ad7f6](https://github.com/alexbaiardi/docker-fiware-ext/commit/d4ad7f6b2247e4bfcec4d568451c291dfb490ba0))
* **deps:** update dependency urllib3 to v2.3.0 ([#202](https://github.com/alexbaiardi/docker-fiware-ext/issues/202)) ([24068ae](https://github.com/alexbaiardi/docker-fiware-ext/commit/24068aef917645a9919ef4d085246b75f3c51016))
* **deps:** update node.js to 22.13 ([#205](https://github.com/alexbaiardi/docker-fiware-ext/issues/205)) ([0d32c69](https://github.com/alexbaiardi/docker-fiware-ext/commit/0d32c69f850b9e3bfbb0bc1e45e1c2907f88c5de))

### Bug Fixes

* **deps:** update dependency org.json:json to v20241224 ([#203](https://github.com/alexbaiardi/docker-fiware-ext/issues/203)) ([195b88e](https://github.com/alexbaiardi/docker-fiware-ext/commit/195b88ed35f185435b306e8b070a1037660f4a69))
* **deps:** update dependency org.json:json to v20250107 ([#206](https://github.com/alexbaiardi/docker-fiware-ext/issues/206)) ([2d2fbd8](https://github.com/alexbaiardi/docker-fiware-ext/commit/2d2fbd8edcae825d95542fe886a043380365bd3c))

### Build and continuous integration

* add persist-images docker image release ([83d1547](https://github.com/alexbaiardi/docker-fiware-ext/commit/83d1547f39f179995154ad394b93515ca3af3269))
* **deps:** update docker/build-push-action digest to 31ca4e5 ([#208](https://github.com/alexbaiardi/docker-fiware-ext/issues/208)) ([873db41](https://github.com/alexbaiardi/docker-fiware-ext/commit/873db41e4b1bb4569913f9c15772ea5b7f7c7041))
* **deps:** update docker/build-push-action digest to 7e09459 ([#200](https://github.com/alexbaiardi/docker-fiware-ext/issues/200)) ([fb71431](https://github.com/alexbaiardi/docker-fiware-ext/commit/fb7143139919352eb27e0c8e3ee725c8b7645f5a))
* **deps:** update docker/build-push-action digest to b32b51a ([#207](https://github.com/alexbaiardi/docker-fiware-ext/issues/207)) ([7c740e4](https://github.com/alexbaiardi/docker-fiware-ext/commit/7c740e4dd39119a98993ade551b20dcb851d48eb))
* **deps:** update docker/login-action digest to 327cd5a ([#209](https://github.com/alexbaiardi/docker-fiware-ext/issues/209)) ([60d2bc8](https://github.com/alexbaiardi/docker-fiware-ext/commit/60d2bc8d9fa035fd4b076b4fc3cc2da70ed6c7f8))
* **deps:** update docker/metadata-action digest to 8e1d546 ([#210](https://github.com/alexbaiardi/docker-fiware-ext/issues/210)) ([37b8175](https://github.com/alexbaiardi/docker-fiware-ext/commit/37b8175ebc6798b3253509ecb6eb4956c3ec2088))

### General maintenance

* **release:** 1.0.27 [skip ci] ([dd6012a](https://github.com/alexbaiardi/docker-fiware-ext/commit/dd6012a937bc53cddd8108b9cb0ff00125e267cf)), closes [#201](https://github.com/alexbaiardi/docker-fiware-ext/issues/201) [#202](https://github.com/alexbaiardi/docker-fiware-ext/issues/202) [#203](https://github.com/alexbaiardi/docker-fiware-ext/issues/203) [#200](https://github.com/alexbaiardi/docker-fiware-ext/issues/200)
* **release:** 1.0.28 [skip ci] ([aa4746d](https://github.com/alexbaiardi/docker-fiware-ext/commit/aa4746df19a1b84e7f45d56aa35200c7fbce5dca)), closes [#204](https://github.com/alexbaiardi/docker-fiware-ext/issues/204) [#205](https://github.com/alexbaiardi/docker-fiware-ext/issues/205) [#206](https://github.com/alexbaiardi/docker-fiware-ext/issues/206)
* update stack ([433516f](https://github.com/alexbaiardi/docker-fiware-ext/commit/433516fa78086208ee5bd68539bd82234d07a9af))

### Refactoring

* semplified persist image test ([27ffd71](https://github.com/alexbaiardi/docker-fiware-ext/commit/27ffd719f5500e3fee73c8277a5121799d5743fe))

## [1.0.28](https://github.com/w4bo/docker-fiware-ext/compare/1.0.27...1.0.28) (2025-01-08)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.118 ([#204](https://github.com/w4bo/docker-fiware-ext/issues/204)) ([f2c3ce7](https://github.com/w4bo/docker-fiware-ext/commit/f2c3ce7c75a79bc2eefbe9bd3ddd4c1463e79012))
* **deps:** update node.js to 22.13 ([#205](https://github.com/w4bo/docker-fiware-ext/issues/205)) ([0d32c69](https://github.com/w4bo/docker-fiware-ext/commit/0d32c69f850b9e3bfbb0bc1e45e1c2907f88c5de))

### Bug Fixes

* **deps:** update dependency org.json:json to v20250107 ([#206](https://github.com/w4bo/docker-fiware-ext/issues/206)) ([2d2fbd8](https://github.com/w4bo/docker-fiware-ext/commit/2d2fbd8edcae825d95542fe886a043380365bd3c))

## [1.0.27](https://github.com/w4bo/docker-fiware-ext/compare/1.0.26...1.0.27) (2025-01-02)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.117 ([#201](https://github.com/w4bo/docker-fiware-ext/issues/201)) ([e73b704](https://github.com/w4bo/docker-fiware-ext/commit/e73b70441fb2ec4d5686329e2bd898eef74bc332))
* **deps:** update dependency urllib3 to v2.3.0 ([#202](https://github.com/w4bo/docker-fiware-ext/issues/202)) ([24068ae](https://github.com/w4bo/docker-fiware-ext/commit/24068aef917645a9919ef4d085246b75f3c51016))

### Bug Fixes

* **deps:** update dependency org.json:json to v20241224 ([#203](https://github.com/w4bo/docker-fiware-ext/issues/203)) ([195b88e](https://github.com/w4bo/docker-fiware-ext/commit/195b88ed35f185435b306e8b070a1037660f4a69))

### Build and continuous integration

* **deps:** update docker/build-push-action digest to 7e09459 ([#200](https://github.com/w4bo/docker-fiware-ext/issues/200)) ([fb71431](https://github.com/w4bo/docker-fiware-ext/commit/fb7143139919352eb27e0c8e3ee725c8b7645f5a))

## [1.0.26](https://github.com/w4bo/docker-fiware-ext/compare/1.0.25...1.0.26) (2024-12-16)

### Bug Fixes

* **deps:** update junit5 monorepo to v5.11.4 ([#199](https://github.com/w4bo/docker-fiware-ext/issues/199)) ([d406c10](https://github.com/w4bo/docker-fiware-ext/commit/d406c10dee0932d5b659ac15ce02b221de0ddcbd))

## [1.0.25](https://github.com/w4bo/docker-fiware-ext/compare/1.0.24...1.0.25) (2024-12-16)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.115 ([#182](https://github.com/w4bo/docker-fiware-ext/issues/182)) ([73c0419](https://github.com/w4bo/docker-fiware-ext/commit/73c04190cd67ebfee8c11c47106d2815f037ab17))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.116 ([#195](https://github.com/w4bo/docker-fiware-ext/issues/195)) ([4498ae7](https://github.com/w4bo/docker-fiware-ext/commit/4498ae791d0f9645edf08bd0196c42f3349639a7))
* **deps:** update docker.io/bitnami/kafka docker tag to v3.9 ([#184](https://github.com/w4bo/docker-fiware-ext/issues/184)) ([02fab38](https://github.com/w4bo/docker-fiware-ext/commit/02fab3891dfe38203fe3b00f9fea39f8d1650e0e))
* **deps:** update node.js to 22.12 ([#194](https://github.com/w4bo/docker-fiware-ext/issues/194)) ([f101743](https://github.com/w4bo/docker-fiware-ext/commit/f10174321f6fd49b8ccf54393248749e0fab4dbf))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v2.1.0 ([#192](https://github.com/w4bo/docker-fiware-ext/issues/192)) ([ebe2089](https://github.com/w4bo/docker-fiware-ext/commit/ebe20896cd3e1965f7765e49506d33e9281c5a6d))

### Bug Fixes

* **deps:** update dependency io.github.cdimascio:dotenv-kotlin to v6.5.0 ([#198](https://github.com/w4bo/docker-fiware-ext/issues/198)) ([e5094a2](https://github.com/w4bo/docker-fiware-ext/commit/e5094a2e84c85508ea632cb701f567cfa773b4b1))

### Build and continuous integration

* **deps:** update docker/build-push-action digest to 0259cb0 ([#190](https://github.com/w4bo/docker-fiware-ext/issues/190)) ([a023437](https://github.com/w4bo/docker-fiware-ext/commit/a023437b65c918874a8d31c89775ff382ce2b041))
* **deps:** update docker/build-push-action digest to 11be14d ([#196](https://github.com/w4bo/docker-fiware-ext/issues/196)) ([95a4693](https://github.com/w4bo/docker-fiware-ext/commit/95a4693c685811a61350a303129153173ada534c))
* **deps:** update docker/build-push-action digest to 48aba3b ([#191](https://github.com/w4bo/docker-fiware-ext/issues/191)) ([56b30f7](https://github.com/w4bo/docker-fiware-ext/commit/56b30f7e78a6e523d1af6f55f31702779cc7ea8e))
* **deps:** update docker/build-push-action digest to 8796455 ([#193](https://github.com/w4bo/docker-fiware-ext/issues/193)) ([9960884](https://github.com/w4bo/docker-fiware-ext/commit/996088427126c0832bd6a6df9ae88070237c21ca))
* **deps:** update docker/metadata-action digest to 1156622 ([#187](https://github.com/w4bo/docker-fiware-ext/issues/187)) ([921256e](https://github.com/w4bo/docker-fiware-ext/commit/921256efc58147794e089a279f95e006cde261ea))
* **deps:** update docker/metadata-action digest to 32323e5 ([#185](https://github.com/w4bo/docker-fiware-ext/issues/185)) ([0a170d5](https://github.com/w4bo/docker-fiware-ext/commit/0a170d533831045f36f2ebd990e8d7b7f1750e0d))
* **deps:** update docker/metadata-action digest to 369eb59 ([#188](https://github.com/w4bo/docker-fiware-ext/issues/188)) ([0cd135f](https://github.com/w4bo/docker-fiware-ext/commit/0cd135f846003efcf5420a3f4c369fa3105d5b1d))
* **deps:** update docker/metadata-action digest to 44d81d6 ([#186](https://github.com/w4bo/docker-fiware-ext/issues/186)) ([e9e0c8e](https://github.com/w4bo/docker-fiware-ext/commit/e9e0c8e451ce8fd855a73ca832a4c83c9a4bf7f4))
* **deps:** update docker/metadata-action digest to 906ecf0 ([#197](https://github.com/w4bo/docker-fiware-ext/issues/197)) ([28ae040](https://github.com/w4bo/docker-fiware-ext/commit/28ae040b4417283cf4fcfda62d2db887405ba004))
* **deps:** update docker/metadata-action digest to b53be03 ([#189](https://github.com/w4bo/docker-fiware-ext/issues/189)) ([f3cca0d](https://github.com/w4bo/docker-fiware-ext/commit/f3cca0da6af67846334e9c5e8fbd81c463d5a957))
* **deps:** update docker/metadata-action digest to bd26c98 ([#183](https://github.com/w4bo/docker-fiware-ext/issues/183)) ([6cc7072](https://github.com/w4bo/docker-fiware-ext/commit/6cc70723f86770211c2b887a4b4d65880f38b30d))

## [1.0.24](https://github.com/w4bo/docker-fiware-ext/compare/1.0.23...1.0.24) (2024-11-07)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.114 ([a77c655](https://github.com/w4bo/docker-fiware-ext/commit/a77c655325c3f6eb76c2a6426c9275d50097045c))
* **deps:** update node.js to v22 ([b5ca5d7](https://github.com/w4bo/docker-fiware-ext/commit/b5ca5d7d7141191f454e7a9f746c6769006a321b))

### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.9.0 ([ec5ce34](https://github.com/w4bo/docker-fiware-ext/commit/ec5ce34cd2065d05e847473c32ab0e705f58b934))

### Build and continuous integration

* **deps:** update docker/login-action digest to 7ca3450 ([518437f](https://github.com/w4bo/docker-fiware-ext/commit/518437faa7ae887d107ba78630990fe8517d2ead))
* **deps:** update docker/metadata-action digest to 0de3687 ([161b336](https://github.com/w4bo/docker-fiware-ext/commit/161b33679d46d980e77c04463e6fb5c3692a9b22))

## [1.0.23](https://github.com/w4bo/docker-fiware-ext/compare/1.0.22...1.0.23) (2024-10-29)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.112 ([98727f3](https://github.com/w4bo/docker-fiware-ext/commit/98727f36271680bea603c7ac98cce1dfee652490))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.113 ([5ee85c4](https://github.com/w4bo/docker-fiware-ext/commit/5ee85c468fed182d8d0974694c2963791275dd64))

### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.8.1 ([521563f](https://github.com/w4bo/docker-fiware-ext/commit/521563f81556926f4ec7ef0c0d5aab621e395986))

### Build and continuous integration

* **deps:** update actions/checkout action to v4.2.2 ([a519d53](https://github.com/w4bo/docker-fiware-ext/commit/a519d5302b54b2c574e54a4517ac522f53ecbacc))
* **deps:** update actions/setup-node action to v4.1.0 ([8d64fc4](https://github.com/w4bo/docker-fiware-ext/commit/8d64fc499183f3d567178d573b0a18a46437839c))
* **deps:** update docker/build-push-action digest to 5e99dac ([3a626ed](https://github.com/w4bo/docker-fiware-ext/commit/3a626edb1f54292f19ce66b5f2307cc0717d76dd))
* **deps:** update docker/login-action digest to 0689575 ([2102697](https://github.com/w4bo/docker-fiware-ext/commit/210269761bba6752a17e0cf25e889ee9697830ed))
* **deps:** update docker/login-action digest to 5d8785b ([eb0fac3](https://github.com/w4bo/docker-fiware-ext/commit/eb0fac36b86fc72596dea1c97745521ac0d3f758))
* **deps:** update docker/metadata-action digest to d31acd5 ([f4dc471](https://github.com/w4bo/docker-fiware-ext/commit/f4dc47150d93385e6799f427f1829975443a439f))

## [1.0.22](https://github.com/w4bo/docker-fiware-ext/compare/1.0.21...1.0.22) (2024-10-21)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.111 ([2ac5725](https://github.com/w4bo/docker-fiware-ext/commit/2ac57253c7360ed2e5f26a081063c2009751d372))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v2.0.21 ([3e0fb42](https://github.com/w4bo/docker-fiware-ext/commit/3e0fb4286540e1d6d9dc1e34e317ceb6d877ae1d))

### Bug Fixes

* **deps:** update junit5 monorepo to v5.11.3 ([a4379dc](https://github.com/w4bo/docker-fiware-ext/commit/a4379dc641dc29882da777cd0ed85d23dd5acd34))

### Build and continuous integration

* **deps:** update actions/checkout action to v4.2.1 ([92a44b1](https://github.com/w4bo/docker-fiware-ext/commit/92a44b1d5a99f050d43cec76fe51feb6e53e57b1))
* **deps:** update docker/login-action digest to 1f36f5b ([32c1688](https://github.com/w4bo/docker-fiware-ext/commit/32c1688650a801b34b00a695053fc38539fcf807))

## [1.0.21](https://github.com/w4bo/docker-fiware-ext/compare/1.0.20...1.0.21) (2024-10-05)

### Dependency updates

* **deps:** update dependency pymongo to v4.10.0 ([0d9585f](https://github.com/w4bo/docker-fiware-ext/commit/0d9585fbb6697ac645d20848bb3ab5ff33a3ce1c))
* **deps:** update dependency pymongo to v4.10.1 ([5dab9b4](https://github.com/w4bo/docker-fiware-ext/commit/5dab9b4f0cd8c43eb98297dd67ef5779296ad202))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.109 ([2ee61a6](https://github.com/w4bo/docker-fiware-ext/commit/2ee61a6fc7bdbd5d44955c2b9b38d768651e8cb3))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.110 ([fb7cd76](https://github.com/w4bo/docker-fiware-ext/commit/fb7cd76857c66ae9c78ea8fc56a916d091536ac6))
* **deps:** update node.js to 20.18 ([6f22697](https://github.com/w4bo/docker-fiware-ext/commit/6f22697ddc256041327bb829684d4ebc612915d1))

### Bug Fixes

* **deps:** update junit5 monorepo to v5.11.2 ([1851154](https://github.com/w4bo/docker-fiware-ext/commit/18511549fc87333a8c896e575cf98db1dab2f5d6))

### Build and continuous integration

* **deps:** update actions/checkout action to v4.2.0 ([fcee592](https://github.com/w4bo/docker-fiware-ext/commit/fcee5922a1bb037715cdb8dc2827ede1785f7fcc))
* **deps:** update dependency ubuntu to v24 ([652c2f3](https://github.com/w4bo/docker-fiware-ext/commit/652c2f3a354a513b51e8e4fc974919125d9f0dac))
* **deps:** update docker/build-push-action digest to 4f58ea7 ([d97ec7b](https://github.com/w4bo/docker-fiware-ext/commit/d97ec7bab2f00ca788c1362269ba429e84f21404))
* **deps:** update docker/build-push-action digest to e44afff ([07043e9](https://github.com/w4bo/docker-fiware-ext/commit/07043e9ba79ae84913b074a505d88177144d5601))
* **deps:** update docker/login-action digest to 29df2a9 ([e743b2f](https://github.com/w4bo/docker-fiware-ext/commit/e743b2f276c83cc8617e30e63fed2862d697b4af))

## [1.0.20](https://github.com/w4bo/docker-fiware-ext/compare/1.0.19...1.0.20) (2024-09-25)

### Dependency updates

* **deps:** update dependency pymongo to v4.9 ([4899bbe](https://github.com/w4bo/docker-fiware-ext/commit/4899bbe5038a4d646b60c0d486d30ade1cef3df5))
* **deps:** update dependency pymongo to v4.9.1 ([9284bc2](https://github.com/w4bo/docker-fiware-ext/commit/9284bc2e013353a0fae85119f88de48a9de72f28))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.106 ([ebdab2e](https://github.com/w4bo/docker-fiware-ext/commit/ebdab2e0e343a1aa60c47066e7a0671822b0cc48))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.107 ([8b2c96f](https://github.com/w4bo/docker-fiware-ext/commit/8b2c96f2130ca83091015dcd323b38a4ae3ef9d1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.108 ([a7150ba](https://github.com/w4bo/docker-fiware-ext/commit/a7150ba7135853a24a1f9307c8a28b57e269fe45))
* **deps:** update dependency urllib3 to v2.2.3 ([8eb73c6](https://github.com/w4bo/docker-fiware-ext/commit/8eb73c63b5b48cb4564e31a7054a1c5fad4f7849))
* **deps:** update mongo docker tag to v8 ([6883c8d](https://github.com/w4bo/docker-fiware-ext/commit/6883c8d7a264ab5a879999dc19f0fb6795aefe87))

### Bug Fixes

* **deps:** update junit5 monorepo to v5.11.1 ([37717a0](https://github.com/w4bo/docker-fiware-ext/commit/37717a0cec25809408ff9899815db1f69f7b7146))

### Build and continuous integration

* **deps:** update actions/setup-node action to v4.0.4 ([1fd1413](https://github.com/w4bo/docker-fiware-ext/commit/1fd14138ed1645c1b5058bb397512e27337839b6))
* **deps:** update docker/login-action digest to 3b8fed7 ([b17dd9b](https://github.com/w4bo/docker-fiware-ext/commit/b17dd9b90216a961360a45cd296c549e1ca54036))
* **deps:** update docker/metadata-action digest to 70b2cdc ([dd770dd](https://github.com/w4bo/docker-fiware-ext/commit/dd770dd133bb804272cc8744d2945302c516ab71))

## [1.0.19](https://github.com/w4bo/docker-fiware-ext/compare/1.0.18...1.0.19) (2024-09-12)

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.101 ([54d66fd](https://github.com/w4bo/docker-fiware-ext/commit/54d66fda2b2106f663a9d9caa130986ffc126449))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.102 ([6a59bb3](https://github.com/w4bo/docker-fiware-ext/commit/6a59bb35923820e630f2378fb9678e6b4487dab9))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.103 ([44c19ba](https://github.com/w4bo/docker-fiware-ext/commit/44c19baa1dd90392edbb6298748ac78786a44cd2))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.104 ([c91686c](https://github.com/w4bo/docker-fiware-ext/commit/c91686c0fc4d71c69961aa8f57ee40dcc35cce4f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.105 ([900e240](https://github.com/w4bo/docker-fiware-ext/commit/900e240023cccb1798263577b2ceb681b495bc53))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.86 ([56e68f4](https://github.com/w4bo/docker-fiware-ext/commit/56e68f4b3430c12ed6ea6a46c2becb5b46852bdd))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.87 ([6a6736c](https://github.com/w4bo/docker-fiware-ext/commit/6a6736c6daa44ff543f053e72b721bdaee061e92))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.89 ([a75f91c](https://github.com/w4bo/docker-fiware-ext/commit/a75f91c235e9c901f6a706c4de4f1670c5409c2c))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.90 ([87ba246](https://github.com/w4bo/docker-fiware-ext/commit/87ba246161845e536544e9c256f09d94846cb969))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.91 ([ab90fa3](https://github.com/w4bo/docker-fiware-ext/commit/ab90fa35808aed350433ed69022cf191ca03fa60))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.92 ([095858a](https://github.com/w4bo/docker-fiware-ext/commit/095858a596493d71198173ecca521f43428a3b33))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.93 ([847457e](https://github.com/w4bo/docker-fiware-ext/commit/847457ee077df18b21301dbae490caf2d605db83))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.94 ([9798019](https://github.com/w4bo/docker-fiware-ext/commit/979801978cf1ea16f2a0067e9dfd4a75a52654b0))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.95 ([1b60bba](https://github.com/w4bo/docker-fiware-ext/commit/1b60bba017bf752d2365e0d4cdb08ed6cd8b822a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.96 ([fadc752](https://github.com/w4bo/docker-fiware-ext/commit/fadc7528bf9bda01d751a155b0c2d0a5121b4bd7))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.97 ([33d475a](https://github.com/w4bo/docker-fiware-ext/commit/33d475a0f0badf5dc4f4d5a370a289b4569e804a))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.98 ([4747267](https://github.com/w4bo/docker-fiware-ext/commit/4747267618ee03a1ea2b12ca5bffc1f79304bad1))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.99 ([5b8a793](https://github.com/w4bo/docker-fiware-ext/commit/5b8a7930bba0b3e1683154df46606131fab82393))
* **deps:** update docker.io/bitnami/kafka docker tag to v3.8 ([0295a9e](https://github.com/w4bo/docker-fiware-ext/commit/0295a9e133ce8747230a490d44905a72fb229cff))
* **deps:** update node.js to 20.16 ([8cc7f16](https://github.com/w4bo/docker-fiware-ext/commit/8cc7f1653e35574edc8b26814261c27b356f881a))
* **deps:** update node.js to 20.17 ([d80ef5b](https://github.com/w4bo/docker-fiware-ext/commit/d80ef5b7b49bf7139868fdcf15887f7278eabfdc))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v2.0.10 ([82ef595](https://github.com/w4bo/docker-fiware-ext/commit/82ef5952b5cac62fbe62a01158644ddfa7b288b1))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v2.0.20 ([6dfab4d](https://github.com/w4bo/docker-fiware-ext/commit/6dfab4d9c45d1f4a9a438f3c687a0473457b0d2d))

### Bug Fixes

* **deps:** update dependency io.github.cdimascio:dotenv-kotlin to v6.4.2 ([254f311](https://github.com/w4bo/docker-fiware-ext/commit/254f311ee72d73f968aa952a2ecd9dc11b4eed0c))
* **deps:** update dependency org.apache.kafka:kafka-clients to v3.8.0 ([e0b7432](https://github.com/w4bo/docker-fiware-ext/commit/e0b7432025f188fae32b726362bb3f713c1e32b9))
* **deps:** update junit5 monorepo to v5.11.0 ([44f2ebd](https://github.com/w4bo/docker-fiware-ext/commit/44f2ebdc6b8297a94461ad08ed4b0a8926cb91aa))
* **deps:** update slf4j monorepo to v2.0.14 ([e0b91a7](https://github.com/w4bo/docker-fiware-ext/commit/e0b91a7b53d2d7bd0c8d85ced0810fa9055f4b29))
* **deps:** update slf4j monorepo to v2.0.15 ([7907d2f](https://github.com/w4bo/docker-fiware-ext/commit/7907d2f05cee2348aa97fae9006d144c798eb0a0))
* **deps:** update slf4j monorepo to v2.0.16 ([9675185](https://github.com/w4bo/docker-fiware-ext/commit/967518514fb77347b7e981087161615f6506fd59))

### Build and continuous integration

* **deps:** update docker/build-push-action digest to 16ebe77 ([a9083a1](https://github.com/w4bo/docker-fiware-ext/commit/a9083a1816e6ffa5de5a7aad854916e4b1eb71ea))
* **deps:** update docker/build-push-action digest to 1a16264 ([5ba9604](https://github.com/w4bo/docker-fiware-ext/commit/5ba96043ef2d03921fb957e92b7d66449d59acd4))
* **deps:** update docker/build-push-action digest to 1ca370b ([3daeca6](https://github.com/w4bo/docker-fiware-ext/commit/3daeca6fce0b7cb3799e871521e0f3b2a8880fa7))
* **deps:** update docker/build-push-action digest to 2dbe91d ([b78dd47](https://github.com/w4bo/docker-fiware-ext/commit/b78dd478b8256a43ae9d9fdbb68d098913f00999))
* **deps:** update docker/build-push-action digest to 4f7cdeb ([ace4c00](https://github.com/w4bo/docker-fiware-ext/commit/ace4c005c9aa6de2be3247225f2f350cab54799a))
* **deps:** update docker/build-push-action digest to 5176d81 ([de405f6](https://github.com/w4bo/docker-fiware-ext/commit/de405f6599cb827965833db0de57d7c0c63e2653))
* **deps:** update docker/build-push-action digest to 5cd11c3 ([352f45f](https://github.com/w4bo/docker-fiware-ext/commit/352f45f50ddd35d9e29b46175b1060619658d53c))
* **deps:** update docker/build-push-action digest to 9552610 ([5842e25](https://github.com/w4bo/docker-fiware-ext/commit/5842e252a339f41a66f279febb99368d6df56023))
* **deps:** update docker/build-push-action digest to a254f8c ([c2d92f5](https://github.com/w4bo/docker-fiware-ext/commit/c2d92f5a26bc21c69a49c2388f780915154015ed))
* **deps:** update docker/build-push-action digest to a8d3541 ([30bca6b](https://github.com/w4bo/docker-fiware-ext/commit/30bca6b46df9d275570b5968a5c1318779ba9b42))
* **deps:** update docker/build-push-action digest to e050dfa ([639badb](https://github.com/w4bo/docker-fiware-ext/commit/639badb5d88fdaae6059b18fd39695fb1e27d31a))
* **deps:** update docker/login-action digest to 9780b0c ([1347f04](https://github.com/w4bo/docker-fiware-ext/commit/1347f04fac13b2649b52a3b89348330f1326aa0a))
* **deps:** update docker/metadata-action digest to 60a0d34 ([3d7d33e](https://github.com/w4bo/docker-fiware-ext/commit/3d7d33e995237eb1e3550e85bd5030fe7396811a))

## [1.0.18](https://github.com/w4bo/docker-fiware-ext/compare/1.0.17...1.0.18) (2024-06-30)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.7.1 ([b762a5f](https://github.com/w4bo/docker-fiware-ext/commit/b762a5fcee4c58e8375eba7de9f6100b99d30178))


### Build and continuous integration

* **deps:** update docker/metadata-action digest to a64d048 ([6c6ad51](https://github.com/w4bo/docker-fiware-ext/commit/6c6ad5159426b769e7f270b810fb76f0f9f02b7e))

## [1.0.17](https://github.com/w4bo/docker-fiware-ext/compare/1.0.16...1.0.17) (2024-06-27)


### Dependency updates

* **deps:** update dependency pymongo to v4.7.0 ([edce6a3](https://github.com/w4bo/docker-fiware-ext/commit/edce6a3567c702cc3070724de32ecb2405395e7d))
* **deps:** update dependency pymongo to v4.7.1 ([31f89ff](https://github.com/w4bo/docker-fiware-ext/commit/31f89ff7374051bb89b14bfa6c148e3d6dfbabdf))
* **deps:** update dependency pymongo to v4.7.2 ([0801e53](https://github.com/w4bo/docker-fiware-ext/commit/0801e53592304cbb48b32e18def340dbda423970))
* **deps:** update dependency pymongo to v4.7.3 ([0419556](https://github.com/w4bo/docker-fiware-ext/commit/0419556842ea8ed0a0dd8e24d62c2a123b59637b))
* **deps:** update dependency pymongo to v4.8.0 ([6373fc8](https://github.com/w4bo/docker-fiware-ext/commit/6373fc8586d03d39a0042a2f9bb45280e2a6f388))
* **deps:** update dependency requests to v2.32.2 [security] ([349e769](https://github.com/w4bo/docker-fiware-ext/commit/349e7693d55751ed0738af7b866f17eb9a3e16bb))
* **deps:** update dependency requests to v2.32.3 ([1baa2b1](https://github.com/w4bo/docker-fiware-ext/commit/1baa2b1ea8f05f6983c1a1a6c5977d3245a1f8b0))
* **deps:** update dependency urllib3 to v2.2.2 [security] ([864bea3](https://github.com/w4bo/docker-fiware-ext/commit/864bea3ab362ed53a12ba2a8294c356d9299e28c))
* **deps:** update fiware/orion docker tag to v3.12.0 ([05dc327](https://github.com/w4bo/docker-fiware-ext/commit/05dc3274cd6e32a26d02de07c1732b4323f6cc4a))
* **deps:** update node.js to 20.13 ([51331f3](https://github.com/w4bo/docker-fiware-ext/commit/51331f369d1ea5bf34c75bbdd2c8fe95f431b2e5))
* **deps:** update node.js to 20.14 ([f719bee](https://github.com/w4bo/docker-fiware-ext/commit/f719bee70000d6da61681363423ab7b68a2a30c8))
* **deps:** update node.js to 20.15 ([72149af](https://github.com/w4bo/docker-fiware-ext/commit/72149af9a32b42d64f4edbdb22133e064f4824eb))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.9.24 ([943f576](https://github.com/w4bo/docker-fiware-ext/commit/943f576787046a2d0bb46dbf15e0f9ee171d7142))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v2 ([3e193e0](https://github.com/w4bo/docker-fiware-ext/commit/3e193e0d39673371280c6c15235dd53ce8e5d749))


### Bug Fixes

* **deps:** update junit5 monorepo to v5.10.3 ([6e055df](https://github.com/w4bo/docker-fiware-ext/commit/6e055dfe6a98953b8733c033c1b2f297f010e86a))


### Build and continuous integration

* **deps:** update actions/checkout action to v4.1.3 ([46138f8](https://github.com/w4bo/docker-fiware-ext/commit/46138f82c5d3f5f038e641c4be0a374322e62f12))
* **deps:** update actions/checkout action to v4.1.4 ([9e47a84](https://github.com/w4bo/docker-fiware-ext/commit/9e47a84de4510ef8d2c53f1991a92f7858801edb))
* **deps:** update actions/checkout action to v4.1.6 ([31e22cf](https://github.com/w4bo/docker-fiware-ext/commit/31e22cf82b17ba480349d86659921b3c8b981c18))
* **deps:** update actions/checkout action to v4.1.7 ([a1335bc](https://github.com/w4bo/docker-fiware-ext/commit/a1335bcd3ad48bc930de4c2653a304c5dd9babb0))
* **deps:** update docker/build-push-action digest to 1556069 ([55b0ed5](https://github.com/w4bo/docker-fiware-ext/commit/55b0ed50aa0e57d97c5bd5a0c0447cc9bcd06116))
* **deps:** update docker/build-push-action digest to 2a53c6c ([c906690](https://github.com/w4bo/docker-fiware-ext/commit/c906690fa92e26334c0304aada3b718a843c4437))
* **deps:** update docker/build-push-action digest to 31159d4 ([2f6e8d1](https://github.com/w4bo/docker-fiware-ext/commit/2f6e8d16b675871568e1fd05f98c3060c735193b))
* **deps:** update docker/build-push-action digest to 4367da9 ([d54a9a8](https://github.com/w4bo/docker-fiware-ext/commit/d54a9a881e182fe0f5994d6aa91172e614908d60))
* **deps:** update docker/build-push-action digest to 729f7f4 ([6e1080a](https://github.com/w4bo/docker-fiware-ext/commit/6e1080a2885e77a2dcb408672aa9a936a6cd3cdc))
* **deps:** update docker/build-push-action digest to 7e6f776 ([7e897a7](https://github.com/w4bo/docker-fiware-ext/commit/7e897a7f9640f19e3367059b4371a459a05f9696))
* **deps:** update docker/build-push-action digest to 84354d3 ([f582b08](https://github.com/w4bo/docker-fiware-ext/commit/f582b08eeb0abb9e969bf49b24545b2fc42807a9))
* **deps:** update docker/build-push-action digest to 86c2bd0 ([34be177](https://github.com/w4bo/docker-fiware-ext/commit/34be177f661c4bae3cc008c76fc3d26561bfb055))
* **deps:** update docker/build-push-action digest to 94f8f8c ([7f369db](https://github.com/w4bo/docker-fiware-ext/commit/7f369dbb1321ad779cc10c5c07a9ce08f22e8b02))
* **deps:** update docker/build-push-action digest to af64c4e ([3b435c7](https://github.com/w4bo/docker-fiware-ext/commit/3b435c7765493420797d9b756c00de83fb07737a))
* **deps:** update docker/build-push-action digest to ca052bb ([351c202](https://github.com/w4bo/docker-fiware-ext/commit/351c202e77d44b90d72cb537fca6286add5ed368))
* **deps:** update docker/build-push-action digest to cfed4e9 ([833ef0e](https://github.com/w4bo/docker-fiware-ext/commit/833ef0e6c6114b464c062507bd1938e17eba0ed8))
* **deps:** update docker/build-push-action digest to df19a79 ([b503bd2](https://github.com/w4bo/docker-fiware-ext/commit/b503bd23fffa9b384ef844679b88fe99ec120fe5))
* **deps:** update docker/build-push-action digest to eb539f4 ([e288bf4](https://github.com/w4bo/docker-fiware-ext/commit/e288bf4f83661facab0e68c3bf611a74e4098f0f))
* **deps:** update docker/build-push-action digest to ef6cba3 ([99a5446](https://github.com/w4bo/docker-fiware-ext/commit/99a5446e7851c84395b7de4afbda55777c456f01))
* **deps:** update docker/login-action digest to 0d4c9c5 ([8119f98](https://github.com/w4bo/docker-fiware-ext/commit/8119f98ceb53747c39754f83425494aadd1eb7b5))
* **deps:** update docker/login-action digest to 70fccc7 ([114eeea](https://github.com/w4bo/docker-fiware-ext/commit/114eeea083cfae5db410bf964f882b06b598e82c))
* **deps:** update docker/login-action digest to db77945 ([0be5f02](https://github.com/w4bo/docker-fiware-ext/commit/0be5f02360814a8163310e4ee5aa59bab6bf2078))
* **deps:** update docker/metadata-action digest to 2ee3d30 ([38e0f26](https://github.com/w4bo/docker-fiware-ext/commit/38e0f2616af0211c558cac9bcf704a0e4181df2e))
* **deps:** update docker/metadata-action digest to f7b4ed1 ([b53f224](https://github.com/w4bo/docker-fiware-ext/commit/b53f2241e0e00c5c67cbb1726b29a331235d3043))

## [1.0.16](https://github.com/w4bo/docker-fiware-ext/compare/1.0.15...1.0.16) (2024-04-12)


### Dependency updates

* **deps:** update dependency pymongo to v4.6.3 ([41979d7](https://github.com/w4bo/docker-fiware-ext/commit/41979d75d951e9b444e768688053ad3505be18b0))
* **deps:** update node.js to 20.12 ([9f4fee1](https://github.com/w4bo/docker-fiware-ext/commit/9f4fee16ecd98dcc133662719df5a6a933031936))


### Bug Fixes

* **deps:** update slf4j monorepo to v2.0.13 ([cc01e45](https://github.com/w4bo/docker-fiware-ext/commit/cc01e45f65d7d24e88f7a4468f4f78344b1d7060))


### Build and continuous integration

* **deps:** update docker/build-push-action digest to 090ca15 ([912b41c](https://github.com/w4bo/docker-fiware-ext/commit/912b41c8dc821859f5b11ce8ddae244a7ba1b9df))
* **deps:** update docker/build-push-action digest to f8bc7f4 ([510de60](https://github.com/w4bo/docker-fiware-ext/commit/510de6001678ef68e3846476aa42e8d715f6a250))
* **deps:** update docker/login-action digest to 5f4866a ([e28a2f6](https://github.com/w4bo/docker-fiware-ext/commit/e28a2f6e51d06c953434c61067ba9bdb780a7627))
* **deps:** update docker/metadata-action digest to 1294d94 ([a1f7584](https://github.com/w4bo/docker-fiware-ext/commit/a1f75841f556bf00970fd5226404bec7582318ce))
* **deps:** update docker/metadata-action digest to 38b3677 ([7c65180](https://github.com/w4bo/docker-fiware-ext/commit/7c65180d28352550a0bbf51c4aafbdcd6dafa3fd))
* **deps:** update docker/metadata-action digest to c314eea ([3b62a21](https://github.com/w4bo/docker-fiware-ext/commit/3b62a218a0aeb27501185f5414621e61e7cded54))

## [1.0.15](https://github.com/w4bo/docker-fiware-ext/compare/1.0.14...1.0.15) (2024-03-17)


### Bug Fixes

* **deps:** update dependency org.json:json to v20240303 ([41f29a5](https://github.com/w4bo/docker-fiware-ext/commit/41f29a533dcd103d25251504a6cbc7d4b25b4d75))

## [1.0.14](https://github.com/w4bo/docker-fiware-ext/compare/1.0.13...1.0.14) (2024-03-16)


### Bug Fixes

* **deps:** update dependency org.json:json to v20240205 ([5bc4d95](https://github.com/w4bo/docker-fiware-ext/commit/5bc4d95f7543db50cdd0dfb11aeaf4424355f9be))

## [1.0.13](https://github.com/w4bo/docker-fiware-ext/compare/1.0.12...1.0.13) (2024-03-16)


### Dependency updates

* **deps:** update mongo docker tag to v7 ([4915aef](https://github.com/w4bo/docker-fiware-ext/commit/4915aef9ffc61087ff445f19901059828163afc9))
* **deps:** update node.js to v20 ([e377e44](https://github.com/w4bo/docker-fiware-ext/commit/e377e446d7992b232651670366f30e6b87b73970))


### Bug Fixes

* **deps:** update dependency org.json:json to v20231013 ([64b6b71](https://github.com/w4bo/docker-fiware-ext/commit/64b6b71a9d88d2bef95ca84a440ea1ca50f65e3e))


### Build and continuous integration

* **deps:** update actions/checkout action to v4 ([8636923](https://github.com/w4bo/docker-fiware-ext/commit/8636923516b1030384ae7effb4d1c7420cfebfa9))
* **deps:** update actions/setup-java action to v4 ([2a4fdf0](https://github.com/w4bo/docker-fiware-ext/commit/2a4fdf0cc1f9fd6a9602ce9437f2e68ef3b5ea4d))
* **deps:** update actions/setup-python action to v5 ([fb55ca3](https://github.com/w4bo/docker-fiware-ext/commit/fb55ca34b19ede3cfe96b0625a8cc0504c2a53b7))

## [1.0.12](https://github.com/w4bo/docker-fiware-ext/compare/1.0.11...1.0.12) (2024-03-15)


### Dependency updates

* **deps:** update dependency pymongo to v4.6.2 ([2f743bf](https://github.com/w4bo/docker-fiware-ext/commit/2f743bf7d311fd93d6bd494b5c1ed8dbb51cb6ba))
* **deps:** update fiware/orion docker tag to v3.11.0 ([63e8651](https://github.com/w4bo/docker-fiware-ext/commit/63e8651f46cb1250dd2fd546bfd6eed9bdd8cf80))
* **deps:** update node.js to 18.19 ([674cd2f](https://github.com/w4bo/docker-fiware-ext/commit/674cd2fa00069ec6934eb98e995c3a5db6fe0f26))


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.7.0 ([4586c7d](https://github.com/w4bo/docker-fiware-ext/commit/4586c7dfa5bda26a3eb819672a58221c27f46365))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.6.0 ([bd7482a](https://github.com/w4bo/docker-fiware-ext/commit/bd7482a9c0828206606d4c50f89082928a38c307))

## [1.0.11](https://github.com/w4bo/docker-fiware-ext/compare/1.0.10...1.0.11) (2024-03-15)


### Bug Fixes

* **Dockerfile:** introducing swarm ([#44](https://github.com/w4bo/docker-fiware-ext/issues/44)) ([3616d4a](https://github.com/w4bo/docker-fiware-ext/commit/3616d4a75fafd9a1b5a0573180c8531af9a5b913))

## [1.0.10](https://github.com/w4bo/docker-fiware-ext/compare/1.0.9...1.0.10) (2024-03-15)


### Bug Fixes

* **deps:** update slf4j monorepo to v2.0.12 ([2df497e](https://github.com/w4bo/docker-fiware-ext/commit/2df497e19d1e2f885cf05138bebe90a8fb2f7fd5))

## [1.0.9](https://github.com/w4bo/docker-fiware-ext/compare/1.0.8...1.0.9) (2024-03-15)


### Bug Fixes

* **deps:** update junit5 monorepo to v5.10.2 ([b581808](https://github.com/w4bo/docker-fiware-ext/commit/b581808ada399f7a7fb33564e456508c97a2aafb))

## [1.0.8](https://github.com/w4bo/docker-fiware-ext/compare/1.0.7...1.0.8) (2024-03-15)


### Bug Fixes

* **deps:** update dependency org.jetbrains.kotlinx:kotlinx-cli to v0.3.6 ([2efd5bd](https://github.com/w4bo/docker-fiware-ext/commit/2efd5bdbc519a21b018f112ba81c8569fe8c0cb5))

## [1.0.7](https://github.com/w4bo/docker-fiware-ext/compare/1.0.6...1.0.7) (2024-03-14)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.5.2 ([303dc71](https://github.com/w4bo/docker-fiware-ext/commit/303dc715cec73538b84afe1d977882824276970b))

## [1.0.6](https://github.com/w4bo/docker-fiware-ext/compare/1.0.5...1.0.6) (2024-03-14)


### Bug Fixes

* **ci:** deploy to docker ([74aa617](https://github.com/w4bo/docker-fiware-ext/commit/74aa617e26a95c254bd9b119288cb3c32979618a))

## [1.0.5](https://github.com/w4bo/dataplatform-core/compare/1.0.4...1.0.5) (2024-03-14)


### Bug Fixes

* **ci:** deploy to docker ([79811ff](https://github.com/w4bo/dataplatform-core/commit/79811ffda5f79396b7f5dfcb530fe24d8eac975e))

## [1.0.4](https://github.com/w4bo/dataplatform-core/compare/1.0.3...1.0.4) (2024-03-14)


### Bug Fixes

* **ci:** add release to dockerhub ([75a3cf4](https://github.com/w4bo/dataplatform-core/commit/75a3cf440014b375a76ea0de568c3ed8304191a4))

## [1.0.3](https://github.com/w4bo/dataplatform-core/compare/1.0.2...1.0.3) (2024-03-14)


### Bug Fixes

* **ci:** add release to dockerhub ([d125a85](https://github.com/w4bo/dataplatform-core/commit/d125a8556077328be846d1562d742ca915bc5ce6))

## [1.0.2](https://github.com/w4bo/dataplatform-core/compare/1.0.1...1.0.2) (2024-03-14)


### Bug Fixes

* **ci:** add release to dockerhub ([3e0b546](https://github.com/w4bo/dataplatform-core/commit/3e0b546f81a28e602ef7efe9a041fd644db5a14f))
* **ci:** add release to dockerhub ([ccd657e](https://github.com/w4bo/dataplatform-core/commit/ccd657ee25b18751d8e5ef2c46ebf349095e557e))

## [1.0.1](https://github.com/w4bo/dataplatform-core/compare/1.0.0...1.0.1) (2024-03-14)


### Dependency updates

* **deps:** update dependency matplotlib to v3.7.5 ([92f1324](https://github.com/w4bo/dataplatform-core/commit/92f13241937803e3a84b8d21b605d0f3f136b0e1))
* **deps:** update dependency notebook to v7.0.8 ([aa83d58](https://github.com/w4bo/dataplatform-core/commit/aa83d5854b3c5a2106b56fa9c899f5613e183988))
* **deps:** update dependency python-dotenv to v1.0.1 ([2f34a89](https://github.com/w4bo/dataplatform-core/commit/2f34a890db80d3f33d276950019e77a442c6ee8b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.85 ([2e97db2](https://github.com/w4bo/dataplatform-core/commit/2e97db206ee750e7242ddb537515534ee2e71ced))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.9.23 ([db3a371](https://github.com/w4bo/dataplatform-core/commit/db3a371e6ed0ef447b67b4e3227cd87ea0e866ad))


### Bug Fixes

* **Dockerfile:** renaming the services and autoregistering fiware2kafka ([e0f0dd7](https://github.com/w4bo/dataplatform-core/commit/e0f0dd754e202d316298e61dd1a0c40e12cd156d))

## 1.0.0 (2024-03-14)


### Bug Fixes

* **docker-compose:** Integrating develop ([#1](https://github.com/w4bo/dataplatform-core/issues/1)) ([d463c0e](https://github.com/w4bo/dataplatform-core/commit/d463c0ec09d8bf5c66446e8e0fe53f20ecc28be9))


### Dependency updates

* **deps:** update dependency notebook to v7.0.7 [security] ([0646f36](https://github.com/w4bo/dataplatform-core/commit/0646f364dc76a3b4f429c133a701f982b3298096))
* **deps:** update dependency urllib3 to v2.0.7 [security] ([e4648ed](https://github.com/w4bo/dataplatform-core/commit/e4648ed8c238d4604afb18ce539ffa493d770acf))

## [1.1.166](https://github.com/w4bo/welaser/compare/1.1.165...1.1.166) (2023-08-04)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.3.3 ([da5cf94](https://github.com/w4bo/welaser/commit/da5cf94c1ca106d1d9644195ea3030799791718d))


### Dependency updates

* **deps:** update dependency notebook to v7.0.2 ([d2da85b](https://github.com/w4bo/welaser/commit/d2da85b863b44bd7a7adb5c1ca0917d5b78e225d))

## [1.1.165](https://github.com/w4bo/welaser/compare/1.1.164...1.1.165) (2023-08-02)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.3.3 ([39db999](https://github.com/w4bo/welaser/commit/39db999a247f3f0c3e85b258276fcdde732a0a44))

## [1.1.164](https://github.com/w4bo/welaser/compare/1.1.163...1.1.164) (2023-08-02)


### Bug Fixes

* **ci:** feat cleandb ([#582](https://github.com/w4bo/welaser/issues/582)) ([f97407b](https://github.com/w4bo/welaser/commit/f97407b8dd919fb605cf334d431057ba43a7a5f8))
* **missionplanner:** update ([#583](https://github.com/w4bo/welaser/issues/583)) ([d4e06e7](https://github.com/w4bo/welaser/commit/d4e06e73e8582a616cc2b9ab1a918af032b35e51))

## [1.1.163](https://github.com/w4bo/welaser/compare/1.1.162...1.1.163) (2023-07-31)


### Bug Fixes

* **deps:** update dependency jest to v29.6.2 ([aab1ef7](https://github.com/w4bo/welaser/commit/aab1ef7fae58548df824c2b01f0548e3a9a10f0b))

## [1.1.162](https://github.com/w4bo/welaser/compare/1.1.161...1.1.162) (2023-07-24)


### Bug Fixes

* **service-dashboard:** fix entity creation ([698daa1](https://github.com/w4bo/welaser/commit/698daa1c6a99a8152d9e34fc8cba400c4890acb5))
* **service-dashboard:** fix entity update ([235e420](https://github.com/w4bo/welaser/commit/235e42003055e3908c4a1d0729ac372d546bfbae))


### Dependency updates

* **deps:** update node.js to 18.17 ([021b835](https://github.com/w4bo/welaser/commit/021b835a01d6b077a6bd5dc2621a9266de83b645))

## [1.1.161](https://github.com/w4bo/welaser/compare/1.1.160...1.1.161) (2023-07-23)


### Bug Fixes

* **deps:** update junit5 monorepo to v5.10.0 ([d345232](https://github.com/w4bo/welaser/commit/d345232c260bfdb1742ba14608525c08c49660ca))

## [1.1.160](https://github.com/w4bo/welaser/compare/1.1.159...1.1.160) (2023-07-21)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.5.1 ([9be454a](https://github.com/w4bo/welaser/commit/9be454acebba32ab21b1d4c1ee6d324aeb858b4c))


### Dependency updates

* **deps:** update dependency notebook to v7 ([23d0a76](https://github.com/w4bo/welaser/commit/23d0a7687f791a38a9107af421b75581759f86ed))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.43 ([1056256](https://github.com/w4bo/welaser/commit/10562565dfd17aed2f11f011425c4a0ad84adada))
* **deps:** update dependency urllib3 to v2.0.4 ([c4228e7](https://github.com/w4bo/welaser/commit/c4228e76ca28843c569f157ee5f6e9cb2bf3ea2c))

## [1.1.159](https://github.com/w4bo/welaser/compare/1.1.158...1.1.159) (2023-07-20)


### Bug Fixes

* **node:** add notification from supervisor ([#571](https://github.com/w4bo/welaser/issues/571)) ([99280ac](https://github.com/w4bo/welaser/commit/99280acaa562937b629901937995696445746e34))


### Dependency updates

* **deps:** update dependency pymongo to v4.4.1 ([c57c8bc](https://github.com/w4bo/welaser/commit/c57c8bca5cfb0de97ef56444acfea9ab8e60b77f))

## [1.1.158](https://github.com/w4bo/welaser/compare/1.1.157...1.1.158) (2023-07-13)


### Bug Fixes

* **docker:** move from docker-compose to docker compose ([4e96b77](https://github.com/w4bo/welaser/commit/4e96b771ad3fe4417f48f575b4d688414e079c7d))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.40 ([7e0d46f](https://github.com/w4bo/welaser/commit/7e0d46f01355857f18c91fcb77541d194db43ca8))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.41 ([f972f06](https://github.com/w4bo/welaser/commit/f972f06cac0f409a999a1a734e78b10de25946ee))

## [1.1.157](https://github.com/w4bo/welaser/compare/1.1.156...1.1.157) (2023-07-06)


### Bug Fixes

* **deps:** update dependency jest to v29.6.1 ([44392ad](https://github.com/w4bo/welaser/commit/44392adbc3291642da35b89450dfa5355c14e59e))


### Dependency updates

* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.9.0 ([923f8a9](https://github.com/w4bo/welaser/commit/923f8a9eedffb05d631cf66345e4b9fee0956809))

## [1.1.156](https://github.com/w4bo/welaser/compare/1.1.155...1.1.156) (2023-07-06)


### Bug Fixes

* **deps:** update dependency jest to v29.6.0 ([ea6b406](https://github.com/w4bo/welaser/commit/ea6b40682806338f587944ea0dd766786e6d762d))


### Dependency updates

* **deps:** update dependency gradle to v7.6.2 ([b59c6c4](https://github.com/w4bo/welaser/commit/b59c6c454a859804d00040502a0492651ca28a45))
* **deps:** update dependency matplotlib to v3.7.2 ([d5d1cfc](https://github.com/w4bo/welaser/commit/d5d1cfc1c4351e86ecbc55b0f6d509d3fb9de736))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.39 ([01e079d](https://github.com/w4bo/welaser/commit/01e079d457a7f836adcb19e32e08ee4558057d51))

## [1.1.155](https://github.com/w4bo/welaser/compare/1.1.154...1.1.155) (2023-06-29)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.3.2 ([c30689b](https://github.com/w4bo/welaser/commit/c30689ba347b6acd1e6d640985e52f064e1afb0d))

## [1.1.154](https://github.com/w4bo/welaser/compare/1.1.153...1.1.154) (2023-06-29)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.3.2 ([7472ac7](https://github.com/w4bo/welaser/commit/7472ac7051a57d3651ff0ef5b36118aab00534f5))


### Dependency updates

* **deps:** update dependency pandas to v2.0.3 ([c236c83](https://github.com/w4bo/welaser/commit/c236c83c425f680e7a98d6f9a185395e064475b7))
* **deps:** update dependency pymongo to v4.4.0 ([929e555](https://github.com/w4bo/welaser/commit/929e555c20a905efea0fe369a02f783b3691166f))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.38 ([1338cb3](https://github.com/w4bo/welaser/commit/1338cb321bfc4ae0b68229451f838c2881edb743))
* **deps:** update fiware/orion docker tag to v3.10.1 ([e3d40f5](https://github.com/w4bo/welaser/commit/e3d40f5d70c6e3c4394f954bd841b1f78a193474))

## [1.1.153](https://github.com/w4bo/welaser/compare/1.1.152...1.1.153) (2023-06-18)


### Bug Fixes

* **deps:** update dependency org.json:json to v20230618 ([2eddb43](https://github.com/w4bo/welaser/commit/2eddb432eda63e69517fd5997e118f656cde210f))

## [1.1.152](https://github.com/w4bo/welaser/compare/1.1.151...1.1.152) (2023-06-17)


### Bug Fixes

* **deps:** update dependency dotenv to v16.3.1 ([52726b7](https://github.com/w4bo/welaser/commit/52726b7f1e2e710c6065ccd505275abbfbbcb199))

## [1.1.151](https://github.com/w4bo/welaser/compare/1.1.150...1.1.151) (2023-06-16)


### Bug Fixes

* **deps:** update dependency dotenv to v16.3.0 ([19b1b7d](https://github.com/w4bo/welaser/commit/19b1b7d102132812ba8e18c0b00f86bfe01abf8e))

## [1.1.150](https://github.com/w4bo/welaser/compare/1.1.149...1.1.150) (2023-06-16)


### Bug Fixes

* **deps:** update dependency dotenv to v16.2.0 ([82ec0a2](https://github.com/w4bo/welaser/commit/82ec0a25c8ab0167c88636174e3986f69b914824))

## [1.1.149](https://github.com/w4bo/welaser/compare/1.1.148...1.1.149) (2023-06-14)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.5.0 ([08e0578](https://github.com/w4bo/welaser/commit/08e0578092f663dda07c4910ea5becc6b2f1214a))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.5.3 ([a62fe47](https://github.com/w4bo/welaser/commit/a62fe47ef449681f985ca6b621cd0bbb41e385b1))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.37 ([5f43d84](https://github.com/w4bo/welaser/commit/5f43d848d2e4070263c3047acc4559d5e3201196))

## [1.1.148](https://github.com/w4bo/welaser/compare/1.1.147...1.1.148) (2023-06-08)


### Bug Fixes

* **deps:** update dependency commons-io:commons-io to v2.13.0 ([da5e2b4](https://github.com/w4bo/welaser/commit/da5e2b431422b1cf79541be5f9e840ce757b49ee))

## [1.1.147](https://github.com/w4bo/welaser/compare/1.1.146...1.1.147) (2023-06-08)


### Bug Fixes

* **deps:** update dependency org.mongodb:mongo-java-driver to v3.12.14 ([73b5b39](https://github.com/w4bo/welaser/commit/73b5b396c6dd70ade747cdf025269ffba9010b1a))


### Dependency updates

* **deps:** update dependency urllib3 to v2.0.3 ([669d88b](https://github.com/w4bo/welaser/commit/669d88b13dd1da7f5213621d56e8c98c273717d5))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.8.22 ([06d7200](https://github.com/w4bo/welaser/commit/06d7200924f9f32a27634fd6f0fe16f2cc7598a3))

## [1.1.146](https://github.com/w4bo/welaser/compare/1.1.145...1.1.146) (2023-06-06)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.4.1 ([010d314](https://github.com/w4bo/welaser/commit/010d314c5a87aa61a7d57b9e81a842e2165dbd9b))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.32 ([52d1483](https://github.com/w4bo/welaser/commit/52d1483c5bbef9180281a12aaa9fb650567dc8f0))

## [1.1.145](https://github.com/w4bo/welaser/compare/1.1.144...1.1.145) (2023-06-04)


### Bug Fixes

* **deps:** update dependency dotenv to v16.1.4 ([cdf81f2](https://github.com/w4bo/welaser/commit/cdf81f271d21f285e4f28dc36dbdba8a43456ebb))

## [1.1.144](https://github.com/w4bo/welaser/compare/1.1.143...1.1.144) (2023-06-01)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.3.1 ([e7e8513](https://github.com/w4bo/welaser/commit/e7e851326f6917337d2cbe13aead908c96d4dd62))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.30 ([e4cae8d](https://github.com/w4bo/welaser/commit/e4cae8d37c491dea483cfba361d51c4859eff44d))

## [1.1.143](https://github.com/w4bo/welaser/compare/1.1.142...1.1.143) (2023-06-01)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.3.1 ([66aaf04](https://github.com/w4bo/welaser/commit/66aaf0474a00c06b5a99b4f69a5b01234ff5aa8c))

## [1.1.142](https://github.com/w4bo/welaser/compare/1.1.141...1.1.142) (2023-05-31)


### Bug Fixes

* **deps:** update dependency dotenv to v16.1.3 ([56503e1](https://github.com/w4bo/welaser/commit/56503e135953eed3fd1d7389dc54b7a5a2f40fd3))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.28 ([b4acbeb](https://github.com/w4bo/welaser/commit/b4acbeb5a307f17818aaa31bb44d67a0462ad90b))

## [1.1.141](https://github.com/w4bo/welaser/compare/1.1.140...1.1.141) (2023-05-31)


### Bug Fixes

* **deps:** update dependency dotenv to v16.1.1 ([ab03479](https://github.com/w4bo/welaser/commit/ab03479a4138238d5a21a6da00ca1c27bb363e34))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.27 ([7ed3565](https://github.com/w4bo/welaser/commit/7ed3565e1b54cf6ba0520cefc163e5af86776af1))

## [1.1.140](https://github.com/w4bo/welaser/compare/1.1.139...1.1.140) (2023-05-30)


### Bug Fixes

* **deps:** update dependency dotenv to v16.1.0 ([56c5088](https://github.com/w4bo/welaser/commit/56c508864499c9252f1eb653107f5e23550ec31f))


### Dependency updates

* **deps:** update dependency pandas to v2.0.2 ([c4b8a03](https://github.com/w4bo/welaser/commit/c4b8a0313157bee4b8fb805c5513514ac55b65d8))
* **deps:** update dependency requests to v2.31.0 ([2de36f4](https://github.com/w4bo/welaser/commit/2de36f4f848553f019fbfd7cbc0540e1f8de1278))

## [1.1.139](https://github.com/w4bo/welaser/compare/1.1.138...1.1.139) (2023-05-18)


### Bug Fixes

* **deps:** update dependency vue to v3.3.4 ([abd9ed8](https://github.com/w4bo/welaser/commit/abd9ed8c52f65e98a279af6a1c6a78285a0c8c0c))

## [1.1.138](https://github.com/w4bo/welaser/compare/1.1.137...1.1.138) (2023-05-17)


### Bug Fixes

* **deps:** update dependency commons-io:commons-io to v2.12.0 ([1d9cf9e](https://github.com/w4bo/welaser/commit/1d9cf9e76730519db420a4410a44981ab0af6560))


### Dependency updates

* **deps:** update dependency jsoneditor to v9.10.2 ([e0b8f08](https://github.com/w4bo/welaser/commit/e0b8f08a60a7833ae31606dce2a6c96d89281a72))

## [1.1.137](https://github.com/w4bo/welaser/compare/1.1.136...1.1.137) (2023-05-15)


### Bug Fixes

* **service-missionplanner:** update ([#514](https://github.com/w4bo/welaser/issues/514)) ([50a1004](https://github.com/w4bo/welaser/commit/50a1004f509b3078557014c680fd4e04506c671a))


### Dependency updates

* **deps:** update dependency jsoneditor to v9.10.1 ([8f0e1c4](https://github.com/w4bo/welaser/commit/8f0e1c403a2d85ef45bcff8a33faece15b58ccd6))

## [1.1.136](https://github.com/w4bo/welaser/compare/1.1.135...1.1.136) (2023-05-12)


### Bug Fixes

* **deps:** update dependency vue to v3.3.2 ([da336f5](https://github.com/w4bo/welaser/commit/da336f5a3e6579507414503d07992c353a208fc9))

## [1.1.135](https://github.com/w4bo/welaser/compare/1.1.134...1.1.135) (2023-05-12)


### Bug Fixes

* **service-missionplanner:** visualize the resulting image ([95bc824](https://github.com/w4bo/welaser/commit/95bc8247d43a64c26063c401a57b148c44999797))

## [1.1.134](https://github.com/w4bo/welaser/compare/1.1.133...1.1.134) (2023-05-11)


### Bug Fixes

* **deps:** update dependency vue to v3.3.1 ([ed9be6c](https://github.com/w4bo/welaser/commit/ed9be6ca51d009854fa7e92f4d7947d667b39160))


### Dependency updates

* **deps:** update dependency requests to v2.30.0 ([22b6388](https://github.com/w4bo/welaser/commit/22b6388822476ebeb98145d6438a1758345f2f96))
* **deps:** update dependency urllib3 to v2 ([2f0cb40](https://github.com/w4bo/welaser/commit/2f0cb404ff99956c4c670f50b2895826789ffbda))

## [1.1.133](https://github.com/w4bo/welaser/compare/1.1.132...1.1.133) (2023-05-04)


### Bug Fixes

* **service-dashboard:** move the missionplanner ([e7f0bbc](https://github.com/w4bo/welaser/commit/e7f0bbcb29a0dafa80b8eca9de6990336203b5de))

## [1.1.132](https://github.com/w4bo/welaser/compare/1.1.131...1.1.132) (2023-05-04)


### Bug Fixes

* **service-dashboard:** fix the landLocation on the map ([2862588](https://github.com/w4bo/welaser/commit/28625888324913bf9de06f6146ff772bbaff5e36))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.26 ([618889a](https://github.com/w4bo/welaser/commit/618889a463ac7a0656f822e7e1fab72f31c39f89))
* **deps:** update welaser/welaser-datamodels digest to 350f507 ([39b11de](https://github.com/w4bo/welaser/commit/39b11de49062092a46be694a378a44879b1da248))

## [1.1.131](https://github.com/w4bo/welaser/compare/1.1.130...1.1.131) (2023-04-27)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.3.0 ([7956d4e](https://github.com/w4bo/welaser/commit/7956d4eeca2b0b3eec9c8156254403d4a6b9a9d0))


### Dependency updates

* **deps:** update dependency requests to v2.29.0 ([8b844c4](https://github.com/w4bo/welaser/commit/8b844c47a0cee2abe3ccf1676ac54b6c44906bc3))

## [1.1.130](https://github.com/w4bo/welaser/compare/1.1.129...1.1.130) (2023-04-26)


### Bug Fixes

* **deps:** update junit5 monorepo to v5.9.3 ([#501](https://github.com/w4bo/welaser/issues/501)) ([16ad52a](https://github.com/w4bo/welaser/commit/16ad52ae3f5ecac70816722b4e586f465f564cc8))
* **welaser:** improvements ([#502](https://github.com/w4bo/welaser/issues/502)) ([53efcde](https://github.com/w4bo/welaser/commit/53efcdead3a3ec4d1b3f2aa7157841ce87f88793))


### Dependency updates

* **deps:** update node.js to v20 ([#497](https://github.com/w4bo/welaser/issues/497)) ([02d6c69](https://github.com/w4bo/welaser/commit/02d6c69687030d94a1c7aab97bd1bda30fa11c80))

## [1.1.129](https://github.com/w4bo/welaser/compare/1.1.128...1.1.129) (2023-04-25)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.3.0 ([1544df5](https://github.com/w4bo/welaser/commit/1544df5acc03e148001c01f299d7ceaf97c81852))


### Dependency updates

* **deps:** update dependency pandas to v2.0.1 ([dcaeee1](https://github.com/w4bo/welaser/commit/dcaeee1a91d7d1ad4603b1c797d93e194007cfd9))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.8.21 ([6c1ab10](https://github.com/w4bo/welaser/commit/6c1ab10dac84edf299608adbc6d41974b41a4dd4))
* **deps:** update welaser/welaser-datamodels digest to 58a2e1d ([a60b784](https://github.com/w4bo/welaser/commit/a60b784b4ff3c8d19758eacade3d292d4b21efa1))

## [1.1.128](https://github.com/w4bo/welaser/compare/1.1.127...1.1.128) (2023-04-19)


### Bug Fixes

* **deps:** update dependency mongodb to v4.16.0 ([6e71772](https://github.com/w4bo/welaser/commit/6e71772ba54fd9598f2bae5eb1bf2cc28965038e))


### Dependency updates

* **deps:** update welaser/welaser-datamodels digest to 5cbe579 ([0353850](https://github.com/w4bo/welaser/commit/03538503cf355211b4dce40a8d056becf9bce105))
* **deps:** update welaser/welaser-datamodels digest to ff15641 ([07246e0](https://github.com/w4bo/welaser/commit/07246e0340a6d576984d32554a87de61926d7b74))

## [1.1.127](https://github.com/w4bo/welaser/compare/1.1.126...1.1.127) (2023-04-13)


### Bug Fixes

* **mosquitto:** enabling both mqtt and mqtts ([#488](https://github.com/w4bo/welaser/issues/488)) ([1fa1ab9](https://github.com/w4bo/welaser/commit/1fa1ab9e5606166dc5f7ee3bc1ada6baa27a7b1d))


### Dependency updates

* **deps:** update node.js to 18.16 ([#486](https://github.com/w4bo/welaser/issues/486)) ([365a4f6](https://github.com/w4bo/welaser/commit/365a4f667d86e2653d0e1de29e88a435d5364835))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.5.2 ([#487](https://github.com/w4bo/welaser/issues/487)) ([73b5f3b](https://github.com/w4bo/welaser/commit/73b5f3bafe00f2e029914cfb806aa93c5bd86865))

## [1.1.126](https://github.com/w4bo/welaser/compare/1.1.125...1.1.126) (2023-04-13)


### Bug Fixes

* **deps:** update dependency org.mongodb:mongo-java-driver to v3.12.13 ([49feca2](https://github.com/w4bo/welaser/commit/49feca28461e658ceb5148a7ca5eb981faa34254))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.5.1 ([b663662](https://github.com/w4bo/welaser/commit/b663662e2b21fdb47eacebf4c144872e6c4f96c4))


### Dependency updates

* **deps:** update dependency notebook to v6.5.4 ([3cef7f4](https://github.com/w4bo/welaser/commit/3cef7f45109008b5a652e77f09f57f342170f569))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.25 ([e9218b9](https://github.com/w4bo/welaser/commit/e9218b94cbf25e72371a7b8b094c778b4e06a755))

## [1.1.125](https://github.com/w4bo/welaser/compare/1.1.124...1.1.125) (2023-04-05)


### Bug Fixes

* **deps:** update dependency mongodb to v4.15.0 ([dc4d560](https://github.com/w4bo/welaser/commit/dc4d56012b9bcdc23d8c8ea3e5b0b6142354592f))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.5.0 ([70d8f58](https://github.com/w4bo/welaser/commit/70d8f585f37b1050f862286be562edbeeeab1d79))


### Dependency updates

* **deps:** update dependency pandas to v2 ([f51acd7](https://github.com/w4bo/welaser/commit/f51acd7233e1865a45127b456d2343363fffa8d4))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.20 ([a76261c](https://github.com/w4bo/welaser/commit/a76261ccaf20d224aaf64afd13c9def4a75f55b5))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.21 ([54e47e7](https://github.com/w4bo/welaser/commit/54e47e7e5a6425dab0533f0cce9e224ee634c33b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.22 ([2f75496](https://github.com/w4bo/welaser/commit/2f754964ce6169606ab5b92b9b29e91d1c06a347))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.23 ([a72e5f1](https://github.com/w4bo/welaser/commit/a72e5f1f187454f72e3dfecb7d0edeb94429f9c9))
* **deps:** update fiware/orion docker tag to v3.8.1 ([1df1074](https://github.com/w4bo/welaser/commit/1df1074c47f8fbfa1e397a931cb5a7c30910f6a8))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.8.20 ([97cfafb](https://github.com/w4bo/welaser/commit/97cfafb15dec152e74648d9969b1d4d2c0c950c2))

## [1.1.124](https://github.com/w4bo/welaser/compare/1.1.123...1.1.124) (2023-03-23)


### Bug Fixes

* **iota:** ingest and visualize device data from MQTT ([#471](https://github.com/w4bo/welaser/issues/471)) ([e114085](https://github.com/w4bo/welaser/commit/e1140858cdd4d6f84cb672ae0acf0169dd5653b7))

## [1.1.123](https://github.com/w4bo/welaser/compare/1.1.122...1.1.123) (2023-03-21)


### Bug Fixes

* **iota:** allows to create new attributes in entities ([#470](https://github.com/w4bo/welaser/issues/470)) ([40e6ef8](https://github.com/w4bo/welaser/commit/40e6ef8940e539bf69a8e5cae977dc634605ff2c))

## [1.1.122](https://github.com/w4bo/welaser/compare/1.1.121...1.1.122) (2023-03-21)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-simple to v2.0.7 ([fbcae07](https://github.com/w4bo/welaser/commit/fbcae074f7d7ffa6488e5e5eef8653716b02af29))

## [1.1.121](https://github.com/w4bo/welaser/compare/1.1.120...1.1.121) (2023-03-21)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-api to v2.0.7 ([898c235](https://github.com/w4bo/welaser/commit/898c235a9c875c7632bbeb50e690c2ec3df083f7))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.17 ([#466](https://github.com/w4bo/welaser/issues/466)) ([975e20a](https://github.com/w4bo/welaser/commit/975e20a060e12a2581752ad4d608b72537c49544))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.19 ([f890b1b](https://github.com/w4bo/welaser/commit/f890b1b7672eeb779804f0165701ae4f32365f91))

## [1.1.120](https://github.com/w4bo/welaser/compare/1.1.119...1.1.120) (2023-03-16)


### Bug Fixes

* **service-dashboard:** handle missions from multiple robots ([e0a7957](https://github.com/w4bo/welaser/commit/e0a795763a6a33b97a1d28d509395b098ea560eb))

## [1.1.119](https://github.com/w4bo/welaser/compare/1.1.118...1.1.119) (2023-03-16)


### Bug Fixes

* **service-dashboard:** refresh the gui with the latest robot command ([a574f90](https://github.com/w4bo/welaser/commit/a574f907043896c0b2b9cc364b8fc4dd908db173))
* **service-dashboard:** remove the weeding heatmap ([78b1ad4](https://github.com/w4bo/welaser/commit/78b1ad4b2e75d52b5c192628262f91a1652a5863))

## [1.1.118](https://github.com/w4bo/welaser/compare/1.1.117...1.1.118) (2023-03-16)


### Bug Fixes

* **deps:** update dependency jest to v29.5.0 ([#464](https://github.com/w4bo/welaser/issues/464)) ([bd28a84](https://github.com/w4bo/welaser/commit/bd28a84cbfa49073e3a0d11da6979140507e828e))

## [1.1.117](https://github.com/w4bo/welaser/compare/1.1.116...1.1.117) (2023-03-16)


### Bug Fixes

* **deps:** update dependency kafkajs to v2.2.4 ([09bd6b5](https://github.com/w4bo/welaser/commit/09bd6b5b96dbd6816a45c5381aef7b1f06322832))

## [1.1.116](https://github.com/w4bo/welaser/compare/1.1.115...1.1.116) (2023-03-16)


### Bug Fixes

* **deps:** update dependency jest to v29.4.3 ([5e1f96c](https://github.com/w4bo/welaser/commit/5e1f96cee7b78f1869d86611fbbcf1ca9e0a5670))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.4.0 ([076aca1](https://github.com/w4bo/welaser/commit/076aca17a8c03b2c85f2a165a110c1ff40e0066b))

## [1.1.115](https://github.com/w4bo/welaser/compare/1.1.114...1.1.115) (2023-03-15)


### Bug Fixes

* **imagewriter:** do not push the updated links back to the OCB ([#461](https://github.com/w4bo/welaser/issues/461)) ([6ec570b](https://github.com/w4bo/welaser/commit/6ec570b81ebb555de9a7a85a3b31254cc25bf951))
* **service-dashboard:** add API to download statistics ([#459](https://github.com/w4bo/welaser/issues/459)) ([3a0e9bb](https://github.com/w4bo/welaser/commit/3a0e9bb973da78cb1855472bbe50f00793080f27))

## [1.1.114](https://github.com/w4bo/welaser/compare/1.1.113...1.1.114) (2023-03-15)


### Bug Fixes

* **service-dashboard:** export stats ([99199fe](https://github.com/w4bo/welaser/commit/99199fe3709f764362d2e86dc168b2a498e673f0))


### Dependency updates

* **deps:** update dependency urllib3 to v1.26.15 ([66f7208](https://github.com/w4bo/welaser/commit/66f7208479b9270caca57486a6a117e7eb3a0f6f))

## [1.1.113](https://github.com/w4bo/welaser/compare/1.1.112...1.1.113) (2023-03-08)


### Bug Fixes

* **service-dashboard:** fix color of the camera ([e0b6b5d](https://github.com/w4bo/welaser/commit/e0b6b5d695f3006032d29b6696a32ea58142ca31))
* **service-dashboard:** fix the names on the tooltips ([4867498](https://github.com/w4bo/welaser/commit/486749836e3220480f0b53bc6b5f2e10153bc7ca))

## [1.1.112](https://github.com/w4bo/welaser/compare/1.1.111...1.1.112) (2023-03-08)


### Bug Fixes

* **service-dashboard:** add weeding heatmap ([bd21fa8](https://github.com/w4bo/welaser/commit/bd21fa8d91e4e63c9c29f22c9b5b6652b36e1077))
* **welaser-datamodels:** update ([aa6b35b](https://github.com/w4bo/welaser/commit/aa6b35bcf59d872a9277376903f2b0ce0770c524))

## [1.1.111](https://github.com/w4bo/welaser/compare/1.1.110...1.1.111) (2023-03-08)


### Bug Fixes

* **service-dashboard:** remove timestamp ([62462ef](https://github.com/w4bo/welaser/commit/62462ef10b853e61a84862e50edf22afd784e1d4))


### Dependency updates

* **deps:** update node.js to 18.15 ([e6c4a19](https://github.com/w4bo/welaser/commit/e6c4a194f0c97905ee5f62b5dc5b7e2745a2ef46))

## [1.1.110](https://github.com/w4bo/welaser/compare/1.1.109...1.1.110) (2023-03-07)


### Bug Fixes

* **service-dashboard:** directly write json code into entity create/update ([51deff1](https://github.com/w4bo/welaser/commit/51deff11e00e5504e274836e955402cfeab617b7))


### Dependency updates

* **deps:** update dependency notebook to v6.5.3 ([2e2000f](https://github.com/w4bo/welaser/commit/2e2000f7e589a09a0683a2ffc943e0f8ddd5abdf))

## [1.1.109](https://github.com/w4bo/welaser/compare/1.1.108...1.1.109) (2023-03-06)


### Bug Fixes

* **service-dashboard:** fix the formatting of the timestamp ([968faf2](https://github.com/w4bo/welaser/commit/968faf29f5802cc111e2feef375e6e936e497ae4))
* **service-dashboard:** make the menu fixed ([0d14095](https://github.com/w4bo/welaser/commit/0d1409573f96da9a480739b506f861872d2f8494))
* **service-dashboard:** show the names and ids from the mission planner ([391c7ae](https://github.com/w4bo/welaser/commit/391c7aeeafcc2797b6314bc3a8b7cf2267c33185))

## [1.1.108](https://github.com/w4bo/welaser/compare/1.1.107...1.1.108) (2023-03-06)


### Bug Fixes

* **service-dashboard:** fix the key order ([38489fe](https://github.com/w4bo/welaser/commit/38489fef9b1e417712572776e47ac4a2981c15bf))
* **service-dashboard:** fix visualization of imageSnapshot attribute when no extension is provided ([7e78807](https://github.com/w4bo/welaser/commit/7e788076be3204eaf06f7af04ee188cd899c6cf6))

## [1.1.107](https://github.com/w4bo/welaser/compare/1.1.106...1.1.107) (2023-03-06)


### Bug Fixes

* **service-dashboard:** shrink the cameras ([d3f32ea](https://github.com/w4bo/welaser/commit/d3f32ea27d30254f696e33e1c4488114f74f7dd1))


### Dependency updates

* **deps:** update dependency matplotlib to v3.7.1 ([89d2a28](https://github.com/w4bo/welaser/commit/89d2a28637dacbc1ef53db59250364fd2b3537b5))

## [1.1.106](https://github.com/w4bo/welaser/compare/1.1.105...1.1.106) (2023-03-03)


### Bug Fixes

* **service-writeimages:** fix image extension in the url ([bf4ee39](https://github.com/w4bo/welaser/commit/bf4ee39510b51fe6566723b3c53dde2349c6128c))


### Dependency updates

* **deps:** update welaser/welaser-datamodels digest to 41d1ced ([#446](https://github.com/w4bo/welaser/issues/446)) ([2b0308e](https://github.com/w4bo/welaser/commit/2b0308eee03a8ebfe360a058570ed1d57413ddf1))

## [1.1.105](https://github.com/w4bo/welaser/compare/1.1.104...1.1.105) (2023-03-02)


### Bug Fixes

* **mapbuilder:** update ([4564f4f](https://github.com/w4bo/welaser/commit/4564f4f9df1afd85e9db4d972d833af86c9e4040))
* **service-dashboard:** show infos/warnings/errors only for the selected robot ([4dc8a35](https://github.com/w4bo/welaser/commit/4dc8a35ee780233b20346ddabe767b8fc06a4194))

## [1.1.104](https://github.com/w4bo/welaser/compare/1.1.103...1.1.104) (2023-03-01)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.2.4 ([96ce608](https://github.com/w4bo/welaser/commit/96ce60851053cac2d7cb0c03debf6c8c0ce36787))

## [1.1.103](https://github.com/w4bo/welaser/compare/1.1.102...1.1.103) (2023-02-28)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.2.4 ([#443](https://github.com/w4bo/welaser/issues/443)) ([3e7c0c1](https://github.com/w4bo/welaser/commit/3e7c0c131b2094d48af0d289dc6f0ea513f45838))

## [1.1.102](https://github.com/w4bo/welaser/compare/1.1.101...1.1.102) (2023-02-28)


### Bug Fixes

* **mapbuilder:** update the services ([#444](https://github.com/w4bo/welaser/issues/444)) ([6441cd9](https://github.com/w4bo/welaser/commit/6441cd9d2eae8d03f38ef85fa4462d5e3039b9b0))

## [1.1.101](https://github.com/w4bo/welaser/compare/1.1.100...1.1.101) (2023-02-28)


### Bug Fixes

* **deps:** update dependency org.json:json to v20230227 ([b167ddd](https://github.com/w4bo/welaser/commit/b167ddd80c233842e85e47eda0efe4d576a00862))

## [1.1.100](https://github.com/w4bo/welaser/compare/1.1.99...1.1.100) (2023-02-27)


### Bug Fixes

* **deps:** update dependency start-server-and-test to v2 ([66b0f6d](https://github.com/w4bo/welaser/commit/66b0f6d4e50f6481e0d643b54a0a72a7eba2acd0))


### Dependency updates

* **deps:** update dependency gradle to v7.6.1 ([83407c8](https://github.com/w4bo/welaser/commit/83407c82480559db70f654737f8304f27c11f894))

## [1.1.99](https://github.com/w4bo/welaser/compare/1.1.98...1.1.99) (2023-02-24)


### Bug Fixes

* **portainer:** add portainer to monitor the running containers ([#438](https://github.com/w4bo/welaser/issues/438)) ([8478470](https://github.com/w4bo/welaser/commit/8478470b7615647d177321a9540f331ddec85125))


### Dependency updates

* **deps:** update dependency jsoneditor to v9.10.0 ([4d644f3](https://github.com/w4bo/welaser/commit/4d644f3f7e78d3f17f3afc7190bb5ca19ec338cb))
* **deps:** update dependency python-dotenv to v1 ([#437](https://github.com/w4bo/welaser/issues/437)) ([96c4b3e](https://github.com/w4bo/welaser/commit/96c4b3e2d4328892d5bbd497bdf6b297b51ffc1d))

## [1.1.98](https://github.com/w4bo/welaser/compare/1.1.97...1.1.98) (2023-02-20)


### Bug Fixes

* **ci:** run the build twice ([#435](https://github.com/w4bo/welaser/issues/435)) ([b49a415](https://github.com/w4bo/welaser/commit/b49a41538997dafc96b87753a4857357acfa3a59))


### Dependency updates

* **deps:** update welaser/welaser-datamodels digest to 85e0583 ([#433](https://github.com/w4bo/welaser/issues/433)) ([ecad950](https://github.com/w4bo/welaser/commit/ecad950c752b79d78da359834f9f0bdadd99059a))

## [1.1.97](https://github.com/w4bo/welaser/compare/1.1.96...1.1.97) (2023-02-20)


### Bug Fixes

* **kafkaproxy:** run tests from docker compose ([#431](https://github.com/w4bo/welaser/issues/431)) ([64e4b20](https://github.com/w4bo/welaser/commit/64e4b2089946f9332834cc4a30754a330352d055))
* **welaser-datamodels:** update the agrirobot with `infos` attribute ([#432](https://github.com/w4bo/welaser/issues/432)) ([5a174c7](https://github.com/w4bo/welaser/commit/5a174c78757ab588723fd23081f6fa96655cbd1f))

## [1.1.96](https://github.com/w4bo/welaser/compare/1.1.95...1.1.96) (2023-02-16)


### Bug Fixes

* **ftp:** organize images in the following folder hierarchy `agrifarmid/entityid/YYYY-MM-DD/` ([2a4358f](https://github.com/w4bo/welaser/commit/2a4358f6610a42a784cdeacdbb4e01f52321d86e))


### Dependency updates

* **deps:** update welaser/welaser-datamodels digest to f356594 ([86b99b9](https://github.com/w4bo/welaser/commit/86b99b990aa66e4bbccf0ac94577f168cd7daad6))

## [1.1.95](https://github.com/w4bo/welaser/compare/1.1.94...1.1.95) (2023-02-15)


### Bug Fixes

* **deps:** update dependency vue to v3 ([e020bbc](https://github.com/w4bo/welaser/commit/e020bbc929b546c1a62df2085f06ffac5ef09013))


### Dependency updates

* **deps:** update dependency matplotlib to v3.7.0 ([2e853c7](https://github.com/w4bo/welaser/commit/2e853c7e912bd6bb34a93838e9907ea68beadd9b))

## [1.1.94](https://github.com/w4bo/welaser/compare/1.1.93...1.1.94) (2023-02-15)


### Bug Fixes

* **service-kafkaproxy:** fixing the socketio version ([#424](https://github.com/w4bo/welaser/issues/424)) ([b9b1a11](https://github.com/w4bo/welaser/commit/b9b1a1152b9b8aebe6b82ab7645dd0ae6f801b96))

## [1.1.93](https://github.com/w4bo/welaser/compare/1.1.92...1.1.93) (2023-02-09)


### Bug Fixes

* **deps:** update dependency socket.io to v4 ([a9e0e29](https://github.com/w4bo/welaser/commit/a9e0e29313e20e9e4e8fd2bf3fc9459f4faf0c40))

## [1.1.92](https://github.com/w4bo/welaser/compare/1.1.91...1.1.92) (2023-02-08)


### Bug Fixes

* **deps:** update dependency mongodb to v4 ([4549d23](https://github.com/w4bo/welaser/commit/4549d23b86c19dd8972e35266188a740475b3a6b))

## [1.1.91](https://github.com/w4bo/welaser/compare/1.1.90...1.1.91) (2023-02-08)


### Bug Fixes

* **deps:** update dependency kafkajs to v2 ([812663a](https://github.com/w4bo/welaser/commit/812663a7c688c6031a133a14e334d0381c8c3225))

## [1.1.90](https://github.com/w4bo/welaser/compare/1.1.89...1.1.90) (2023-02-07)


### Bug Fixes

* **deps:** update dependency org.mongodb:mongo-java-driver to v3.12.12 ([590a123](https://github.com/w4bo/welaser/commit/590a123784214b5594f70c493491dad0468680ae))

## [1.1.89](https://github.com/w4bo/welaser/compare/1.1.88...1.1.89) (2023-02-07)


### Bug Fixes

* **deps:** update dependency jest to v29 ([389c60f](https://github.com/w4bo/welaser/commit/389c60f15c6bf2007d5c31ae0261bb41428f5a79))

## [1.1.88](https://github.com/w4bo/welaser/compare/1.1.87...1.1.88) (2023-02-07)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.4.0 ([0db7ebf](https://github.com/w4bo/welaser/commit/0db7ebf339d133ee3ea5e0ac075005cfbff1ac58))

## [1.1.87](https://github.com/w4bo/welaser/compare/1.1.86...1.1.87) (2023-02-06)


### Bug Fixes

* **deps:** update dependency jest to v28 ([f7df6ae](https://github.com/w4bo/welaser/commit/f7df6aeea4f5b9b78a592e19ddb33c4a5f11fdcc))

## [1.1.86](https://github.com/w4bo/welaser/compare/1.1.85...1.1.86) (2023-02-06)


### Bug Fixes

* **ci:** adding the test flag ([#421](https://github.com/w4bo/welaser/issues/421)) ([25eb26e](https://github.com/w4bo/welaser/commit/25eb26e060baacf5d2f3d2743ddcc58b4bf93106))

## [1.1.85](https://github.com/w4bo/welaser/compare/1.1.84...1.1.85) (2023-02-06)


### Bug Fixes

* **deps:** update dependency jest to v27 ([36c26a8](https://github.com/w4bo/welaser/commit/36c26a8981d4e29496252842d92f2ca3f7962e72))


### Dependency updates

* **deps:** update welaser/welaser-datamodels digest to c7f9cf5 ([9c024d0](https://github.com/w4bo/welaser/commit/9c024d0db0220fce44cf0ac2d833e10ad523e6c6))

## [1.1.84](https://github.com/w4bo/welaser/compare/1.1.83...1.1.84) (2023-02-05)


### Bug Fixes

* **deps:** update dependency http-status-codes to v2 ([cb229f3](https://github.com/w4bo/welaser/commit/cb229f3366c025c75d1c4a2b9a9c94b6f4637ba1))

## [1.1.83](https://github.com/w4bo/welaser/compare/1.1.82...1.1.83) (2023-02-05)


### Bug Fixes

* **deps:** update dependency dotenv to v16 ([5c468e6](https://github.com/w4bo/welaser/commit/5c468e6d172e799c9dc9e63f9066e82df1ca26b8))

## [1.1.82](https://github.com/w4bo/welaser/compare/1.1.81...1.1.82) (2023-02-05)


### Bug Fixes

* **deps:** update dependency dotenv to v15 ([11ad378](https://github.com/w4bo/welaser/commit/11ad3784f5742b6ebd0784c5c9ac56dc405fe5e6))

## [1.1.81](https://github.com/w4bo/welaser/compare/1.1.80...1.1.81) (2023-02-04)


### Bug Fixes

* **deps:** update dependency dotenv to v14 ([1a572de](https://github.com/w4bo/welaser/commit/1a572de39d6b60ff6b778866d8cf478b2b00fd23))

## [1.1.80](https://github.com/w4bo/welaser/compare/1.1.79...1.1.80) (2023-02-04)


### Bug Fixes

* **deps:** update dependency dotenv to v13 ([820a12f](https://github.com/w4bo/welaser/commit/820a12f8e049b5dd3b41fa036fc3b61e8302f3a6))

## [1.1.79](https://github.com/w4bo/welaser/compare/1.1.78...1.1.79) (2023-02-04)


### Bug Fixes

* **deps:** update dependency dotenv to v12 ([f4f549b](https://github.com/w4bo/welaser/commit/f4f549b94ef4f565522859f73fbd7c4c70c8bc40))

## [1.1.78](https://github.com/w4bo/welaser/compare/1.1.77...1.1.78) (2023-02-03)


### Bug Fixes

* **deps:** update dependency dotenv to v11 ([ff08423](https://github.com/w4bo/welaser/commit/ff084239d619c6489790c027ea1356ff3024589c))


### Dependency updates

* **deps:** update node.js to v19 ([72aa4d0](https://github.com/w4bo/welaser/commit/72aa4d0f3bc1b24cdbf92960771fc413878a3d61))
* **deps:** update welaser/welaser-datamodels digest to 53309d5 ([11f6ef8](https://github.com/w4bo/welaser/commit/11f6ef83e19077719d40c9cdbc2d9580cefc5c0a))

## [1.1.77](https://github.com/w4bo/welaser/compare/1.1.76...1.1.77) (2023-02-03)


### Bug Fixes

* **ci:** testing the web applications ([04a9b7f](https://github.com/w4bo/welaser/commit/04a9b7fccabb994ed6ed530fee1ab43f1452f3b9))

## [1.1.76](https://github.com/w4bo/welaser/compare/1.1.75...1.1.76) (2023-02-03)


### Bug Fixes

* **service-dashboard:** fix the generated env.js ([#398](https://github.com/w4bo/welaser/issues/398)) ([a92b862](https://github.com/w4bo/welaser/commit/a92b862fd6e43da0fa25e7781b90dbfbae0ca320))


### Dependency updates

* **deps:** update node.js to 18.14 ([9e8f50e](https://github.com/w4bo/welaser/commit/9e8f50ef492b6011e2c7e30c22a5a5a9477c82be))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.8.10 ([#395](https://github.com/w4bo/welaser/issues/395)) ([3069000](https://github.com/w4bo/welaser/commit/3069000b5985c684e0cfd421828b92871d1ff675))

## [1.1.75](https://github.com/w4bo/welaser/compare/1.1.74...1.1.75) (2023-02-02)


### Bug Fixes

* **service-kafkaproxy:** error on leader election ([#394](https://github.com/w4bo/welaser/issues/394)) ([faab9d2](https://github.com/w4bo/welaser/commit/faab9d245cb1ab059eb03ea61e9d7649a33158f7))

## [1.1.74](https://github.com/w4bo/welaser/compare/1.1.73...1.1.74) (2023-02-02)


### Bug Fixes

* **service-dashboard:** fix message error ([#393](https://github.com/w4bo/welaser/issues/393)) ([d988a44](https://github.com/w4bo/welaser/commit/d988a444d61a0f515cc7c19f909b6487d0c922d3))

## [1.1.73](https://github.com/w4bo/welaser/compare/1.1.72...1.1.73) (2023-02-02)


### Bug Fixes

* **service-dashboard:** update the web gui ([#392](https://github.com/w4bo/welaser/issues/392)) ([0176055](https://github.com/w4bo/welaser/commit/0176055b1d40d2b742461fd9d8251742c43b6b0b))

## [1.1.72](https://github.com/w4bo/welaser/compare/1.1.71...1.1.72) (2023-02-01)


### Bug Fixes

* **deps:** update dependency io.github.microutils:kotlin-logging-jvm to v3.0.5 ([3601d60](https://github.com/w4bo/welaser/commit/3601d603799e4e0084ee58bbca17cdbfa78b9434))

## [1.1.71](https://github.com/w4bo/welaser/compare/1.1.70...1.1.71) (2023-02-01)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.2.3 ([e332625](https://github.com/w4bo/welaser/commit/e3326250281ab520d2275830e9da80538369a3fe))

## [1.1.70](https://github.com/w4bo/welaser/compare/1.1.69...1.1.70) (2023-02-01)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.2.3 ([eb8102b](https://github.com/w4bo/welaser/commit/eb8102b1d7989cf9ded726b176c984272b7741aa))


### Dependency updates

* **deps:** update fiware/orion docker tag to v3.8.0 ([950cc73](https://github.com/w4bo/welaser/commit/950cc737139ac2d01be38ce0e6c7286d943445eb))
* **deps:** update welaser/welaser-datamodels digest to 46e6f69 ([d1719d6](https://github.com/w4bo/welaser/commit/d1719d64aa853f3bd5c107615ba19c2b84429a72))

## [1.1.69](https://github.com/w4bo/welaser/compare/1.1.68...1.1.69) (2023-01-24)


### Bug Fixes

* **mapbuilder:** fix the timestamp ([#380](https://github.com/w4bo/welaser/issues/380)) ([53278dd](https://github.com/w4bo/welaser/commit/53278dd82cdf0c6db0eb8d577094416f545c869d))


### Dependency updates

* **deps:** update dependency python-dotenv to v0.21.1 ([#375](https://github.com/w4bo/welaser/issues/375)) ([aecaf0c](https://github.com/w4bo/welaser/commit/aecaf0caaf69206a7418f25b7a97a34fb01006ac))

## [1.1.68](https://github.com/w4bo/welaser/compare/1.1.67...1.1.68) (2023-01-24)


### Bug Fixes

* **ftp:** trying another ftp server ([#378](https://github.com/w4bo/welaser/issues/378)) ([eb9b845](https://github.com/w4bo/welaser/commit/eb9b8457c76f5ccf528dd3478464c1c27c702782))
* **mapbuilder:** integrating map builder and mission planner ([#371](https://github.com/w4bo/welaser/issues/371)) ([d71fa6e](https://github.com/w4bo/welaser/commit/d71fa6ea165aa1c1deeb829242fc78502d8a39bf))

## [1.1.67](https://github.com/w4bo/welaser/compare/1.1.66...1.1.67) (2023-01-23)


### Bug Fixes

* **service-dashboard:** add nested devices and visualization of device data ([#348](https://github.com/w4bo/welaser/issues/348)) ([410cf13](https://github.com/w4bo/welaser/commit/410cf1381b6b8c66d02ee35d0041389b30ba52d5))


### Dependency updates

* **deps:** update dependency pandas to v1.5.3 ([5cbb8e5](https://github.com/w4bo/welaser/commit/5cbb8e52b461f8426b516ae64994a271ca230327))

## [1.1.66](https://github.com/w4bo/welaser/compare/1.1.65...1.1.66) (2023-01-19)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.3.2 ([b8d3322](https://github.com/w4bo/welaser/commit/b8d33221db341c1a13132283c3630500e4f186f8))

## [1.1.65](https://github.com/w4bo/welaser/compare/1.1.64...1.1.65) (2023-01-16)


### Bug Fixes

* **deps:** update dependency io.github.cdimascio:dotenv-kotlin to v6.4.1 ([7c34979](https://github.com/w4bo/welaser/commit/7c3497921e7dc1a745564ed7b871e85e8444c78d))


### Dependency updates

* **deps:** update dependency matplotlib to v3.6.3 ([20e8408](https://github.com/w4bo/welaser/commit/20e84085c0d36b34c6aed1d3ac9250ae7451aef5))
* **deps:** update dependency requests to v2.28.2 ([8d26f91](https://github.com/w4bo/welaser/commit/8d26f919270f75585e40d1814f94d330897ece99))
* **deps:** update dependency urllib3 to v1.26.14 ([4eb02c2](https://github.com/w4bo/welaser/commit/4eb02c2c4d1105dc256de69aa0973bf285ba50dd))
* **deps:** update node.js to 18.13 ([2904d6f](https://github.com/w4bo/welaser/commit/2904d6f13c2a428dba4d377585c234dbe9af7841))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.8.0 ([2378908](https://github.com/w4bo/welaser/commit/2378908227543b3de9420e7dcae20aaaee019a0e))
* **deps:** update welaser/welaser-datamodels digest to 387bfef ([7b9e714](https://github.com/w4bo/welaser/commit/7b9e714be31ae39b9cf462e236ebedcf6f83155f))

## [1.1.64](https://github.com/w4bo/welaser/compare/1.1.63...1.1.64) (2023-01-10)


### Bug Fixes

* **deps:** update junit5 monorepo to v5.9.2 ([de04ac3](https://github.com/w4bo/welaser/commit/de04ac3908869a5f48915cce49ec9f3a9a49c663))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.16 ([cd5d14e](https://github.com/w4bo/welaser/commit/cd5d14ed085c5392be895b64e9170f80d5f3cfcf))
* **deps:** update welaser/welaser-datamodels digest to eba7c8e ([e84b4c2](https://github.com/w4bo/welaser/commit/e84b4c2da532d022309f2990e8f9049aedd5aa55))

## [1.1.63](https://github.com/w4bo/welaser/compare/1.1.62...1.1.63) (2023-01-06)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.2.2 ([264c7fc](https://github.com/w4bo/welaser/commit/264c7fcdcf41f867efe0744765d5e910ee35a59f))

## [1.1.62](https://github.com/w4bo/welaser/compare/1.1.61...1.1.62) (2023-01-05)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.2.2 ([0468868](https://github.com/w4bo/welaser/commit/046886829c6ae8a2f30086f283aa4405a86bbd2c))


### Dependency updates

* **deps:** bump engine.io in /welaser/service-dashboard ([#321](https://github.com/w4bo/welaser/issues/321)) ([65b0a77](https://github.com/w4bo/welaser/commit/65b0a772670ff7035d766b8fcbce9608460d2ca4))
* **deps:** bump engine.io in /welaser/service-kafkaproxy ([#322](https://github.com/w4bo/welaser/issues/322)) ([fb953cc](https://github.com/w4bo/welaser/commit/fb953cc0d7f6694ccac0f3f7a86086ef1704e2ef))
* **deps:** update welaser/welaser-datamodels digest to 24a252c ([#347](https://github.com/w4bo/welaser/issues/347)) ([48afb22](https://github.com/w4bo/welaser/commit/48afb22dcbffd66d06c916383e30d4e1af1ccbf9))
* **deps:** update welaser/welaser-datamodels digest to 4e835aa ([#349](https://github.com/w4bo/welaser/issues/349)) ([e76a92f](https://github.com/w4bo/welaser/commit/e76a92f266768b9318f9426203a03cac42e3d4cb))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.3.0 ([767984f](https://github.com/w4bo/welaser/commit/767984fac9160a0f08927fb80523abdfa3882eee))

## [1.1.61](https://github.com/w4bo/welaser/compare/1.1.60...1.1.61) (2022-12-13)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.2.1 ([a495287](https://github.com/w4bo/welaser/commit/a495287524981570ec8c605805f25cdbe216c04e))
* **deps:** update dependency org.slf4j:slf4j-api to v2.0.6 ([9061602](https://github.com/w4bo/welaser/commit/9061602945000bd5f4e10af8a8a6c7fb2ab74c64))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.2.0 ([777d1a2](https://github.com/w4bo/welaser/commit/777d1a2e0e8c7c323d60fc8a9577d64fab3be136))

## [1.1.60](https://github.com/w4bo/welaser/compare/1.1.59...1.1.60) (2022-12-13)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-simple to v2.0.6 ([c1fcfa5](https://github.com/w4bo/welaser/commit/c1fcfa553166c76f03b82e49224ca98244464f5d))


### Dependency updates

* **deps:** update welaser/welaser-datamodels digest to e5519a5 ([f6cac63](https://github.com/w4bo/welaser/commit/f6cac63254590d60bd4fe6ba6f3846c4df20de8a))

## [1.1.59](https://github.com/w4bo/welaser/compare/1.1.58...1.1.59) (2022-12-12)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.2.1 ([2cac827](https://github.com/w4bo/welaser/commit/2cac827c42bfb7506a84602a37f6f1f77f60c5f7))


### Dependency updates

* **deps:** update welaser/welaser-datamodels digest to 58910d3 ([d388838](https://github.com/w4bo/welaser/commit/d3888380ca2b459d88e8020b8f419bf160336f6f))
* **deps:** update welaser/welaser-datamodels digest to 6281557 ([9567569](https://github.com/w4bo/welaser/commit/95675698913aa339d3dcabe519b520f0bf53fc46))
* **deps:** update welaser/welaser-datamodels digest to 857300b ([#330](https://github.com/w4bo/welaser/issues/330)) ([d34af89](https://github.com/w4bo/welaser/commit/d34af890d2f93be4e0aa0e35538c702dec65fb2a))

## [1.1.58](https://github.com/w4bo/welaser/compare/1.1.57...1.1.58) (2022-12-03)


### Bug Fixes

* **deps:** update dependency io.github.cdimascio:dotenv-kotlin to v6.4.0 ([e7acfb2](https://github.com/w4bo/welaser/commit/e7acfb2216dc003b015267f3bd7518aebbb3ab69))

## [1.1.57](https://github.com/w4bo/welaser/compare/1.1.56...1.1.57) (2022-12-03)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-simple to v2.0.5 ([bf7be02](https://github.com/w4bo/welaser/commit/bf7be027e12b108dcf1b499e098cacaa845b65e1))

## [1.1.56](https://github.com/w4bo/welaser/compare/1.1.55...1.1.56) (2022-12-02)


### Bug Fixes

* **deps:** update dependency commons-net:commons-net to v3.9.0 ([51d77aa](https://github.com/w4bo/welaser/commit/51d77aa5b0ee053287d8e8515cfe78ada7452e8b))

## [1.1.55](https://github.com/w4bo/welaser/compare/1.1.54...1.1.55) (2022-12-02)


### Bug Fixes

* **visual-dashboard:** update the dashboard ([#329](https://github.com/w4bo/welaser/issues/329)) ([48af90c](https://github.com/w4bo/welaser/commit/48af90ce9e301b8d0c4227a8e6ef035480e7574c))


### Dependency updates

* **deps:** update dependency gradle to v7.6 ([3feebd4](https://github.com/w4bo/welaser/commit/3feebd4d39cd48e1fed72eda931be94f7fcd2992))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.7.22 ([cfd38ac](https://github.com/w4bo/welaser/commit/cfd38acf3df15f4e17608d0fb532ce63634211d1))

## [1.1.54](https://github.com/w4bo/welaser/compare/1.1.53...1.1.54) (2022-11-25)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-api to v2.0.5 ([caba3eb](https://github.com/w4bo/welaser/commit/caba3ebc26eccf12f6660ed43009fe8ac3061fd1))


### Dependency updates

* **deps:** update dependency pandas to v1.5.2 ([8954a27](https://github.com/w4bo/welaser/commit/8954a27fc1742c7a854cd1a2717feadf32ac7b8b))
* **deps:** update dependency urllib3 to v1.26.13 ([f7c9101](https://github.com/w4bo/welaser/commit/f7c910104f7ee421db63c64265962e99743b13c6))

## [1.1.53](https://github.com/w4bo/welaser/compare/1.1.52...1.1.53) (2022-11-22)


### Bug Fixes

* **welaser-datamodels:** update data models ([cad9a3e](https://github.com/w4bo/welaser/commit/cad9a3e600f515d69abc26e33423899324dd1fa6))


### Dependency updates

* **deps:** update welaser/welaser-datamodels digest to 8a00e87 ([#318](https://github.com/w4bo/welaser/issues/318)) ([c3fb438](https://github.com/w4bo/welaser/commit/c3fb43864d7964dfece3594a12f3d2503578a1fe))

## [1.1.52](https://github.com/w4bo/welaser/compare/1.1.51...1.1.52) (2022-11-22)


### Bug Fixes

* **scripts:** update welaser-datamodels ([#317](https://github.com/w4bo/welaser/issues/317)) ([96202d1](https://github.com/w4bo/welaser/commit/96202d138b2c744c77e5a030a1b1b3e593aaa78b))

## [1.1.51](https://github.com/w4bo/welaser/compare/1.1.50...1.1.51) (2022-11-22)


### Bug Fixes

* **scripts:** install the python packages even if testScripts/venv already exists ([#316](https://github.com/w4bo/welaser/issues/316)) ([8ee1fde](https://github.com/w4bo/welaser/commit/8ee1fdeb5027ebb55263318146ee239ce5ced56c))
* **writeimage:** Feature images ([#315](https://github.com/w4bo/welaser/issues/315)) ([fac21bc](https://github.com/w4bo/welaser/commit/fac21bcd26db83fe9dcde74219d3dd7b963f9678))

## [1.1.50](https://github.com/w4bo/welaser/compare/1.1.49...1.1.50) (2022-11-21)


### Bug Fixes

* **demo:** update the robot GUI ([#314](https://github.com/w4bo/welaser/issues/314)) ([ed2dec6](https://github.com/w4bo/welaser/commit/ed2dec604dc01f31a75e69aea09363d9b725af2e))

## [1.1.49](https://github.com/w4bo/welaser/compare/1.1.48...1.1.49) (2022-11-21)


### Bug Fixes

* **images:** upload images to FTP and update their URL in fiware ([#308](https://github.com/w4bo/welaser/issues/308)) ([8531057](https://github.com/w4bo/welaser/commit/85310574709533765bac870e7729d7f4d46fd16e))

## [1.1.48](https://github.com/w4bo/welaser/compare/1.1.47...1.1.48) (2022-11-18)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-simple to v2.0.4 ([fa6cbbe](https://github.com/w4bo/welaser/commit/fa6cbbe7d41eddcde6ec737f146dca21bb6779b9))

## [1.1.47](https://github.com/w4bo/welaser/compare/1.1.46...1.1.47) (2022-11-18)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-api to v2.0.4 ([3af8101](https://github.com/w4bo/welaser/commit/3af81013373753f2ed08013eeb66df08c297b422))


### Dependency updates

* **deps:** update dependency pymongo to v4.3.3 ([d11382f](https://github.com/w4bo/welaser/commit/d11382f676c999bd18505847527ba7390e7e7399))

## [1.1.46](https://github.com/w4bo/welaser/compare/1.1.45...1.1.46) (2022-11-17)


### Bug Fixes

* **demo:** add mission gui ([#286](https://github.com/w4bo/welaser/issues/286)) ([b56fc6b](https://github.com/w4bo/welaser/commit/b56fc6b7c318c279134428c3e88b02b517797d8a))


### Dependency updates

* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.7.21 ([b8fc1f1](https://github.com/w4bo/welaser/commit/b8fc1f147696d546aa5d7169a58ae5c9f9b1cc79))
* **deps:** update welaser/welaser-datamodels digest to 7b5377c ([e101f42](https://github.com/w4bo/welaser/commit/e101f420225c9ed27ad8a72550ab7afba42f9689))

## [1.1.45](https://github.com/w4bo/welaser/compare/1.1.44...1.1.45) (2022-11-06)


### Bug Fixes

* **deps:** update dependency com.fasterxml.jackson.module:jackson-module-kotlin to v2.14.0 ([1ab0b84](https://github.com/w4bo/welaser/commit/1ab0b8435ede1d168c24568785110b297e8c5f95))


### Dependency updates

* **deps:** update dependency matplotlib to v3.6.2 ([1f8c82e](https://github.com/w4bo/welaser/commit/1f8c82e3186959b606ef2619be39690cff59055c))

## [1.1.44](https://github.com/w4bo/welaser/compare/1.1.43...1.1.44) (2022-11-02)


### Bug Fixes

* **deps:** update dependency io.github.microutils:kotlin-logging-jvm to v3.0.4 ([09065f1](https://github.com/w4bo/welaser/commit/09065f1516f448502e42b80ad5318385cebb96a2))


### Dependency updates

* **deps:** update dependency notebook to v6.5.2 ([d7f25a5](https://github.com/w4bo/welaser/commit/d7f25a5a4d4a08d36f8f14f9a84c68bf5a563595))

## [1.1.43](https://github.com/w4bo/welaser/compare/1.1.42...1.1.43) (2022-10-29)


### Bug Fixes

* **deps:** update dependency io.github.microutils:kotlin-logging-jvm to v3.0.3 ([16011e4](https://github.com/w4bo/welaser/commit/16011e44b622cda7f2ae1656fbbee9299a0415a9))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.15 ([9ccbd23](https://github.com/w4bo/welaser/commit/9ccbd236c24635308d4fde15f5e738cb70fe9385))

## [1.1.42](https://github.com/w4bo/welaser/compare/1.1.41...1.1.42) (2022-10-28)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.1.3 ([818ba63](https://github.com/w4bo/welaser/commit/818ba638c69e3af1458f93f70d2e2a8501f1c2ff))

## [1.1.41](https://github.com/w4bo/welaser/compare/1.1.40...1.1.41) (2022-10-28)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.1.3 ([de391ee](https://github.com/w4bo/welaser/commit/de391ee0440207b50772f5155db251f8c57b5240))


### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.14 ([af60172](https://github.com/w4bo/welaser/commit/af60172a0c89cf55bca325671bbf7900677de1da))
* **deps:** update node.js to 18.12 ([2549a3a](https://github.com/w4bo/welaser/commit/2549a3af29aa4bd02434372201901ae707c56141))
* **deps:** update node.js to v18 ([ee86541](https://github.com/w4bo/welaser/commit/ee865416395757eb491cbf7013ae772309ccf864))

## [1.1.40](https://github.com/w4bo/welaser/compare/1.1.39...1.1.40) (2022-10-20)


### Bug Fixes

* **node:** working on delay charts ([#269](https://github.com/w4bo/welaser/issues/269)) ([7a5cbce](https://github.com/w4bo/welaser/commit/7a5cbce798b77f5b754ff19cee36f4943bcfa3c2))

## [1.1.39](https://github.com/w4bo/welaser/compare/1.1.38...1.1.39) (2022-10-19)


### Bug Fixes

* **node:** working on apis ([#278](https://github.com/w4bo/welaser/issues/278)) ([008116a](https://github.com/w4bo/welaser/commit/008116a0f285327389be1969bb25ea26506b1790))


### Dependency updates

* **deps:** update dependency pandas to v1.5.1 ([321be92](https://github.com/w4bo/welaser/commit/321be921a2119bae060df636db5a42c59a4d6d31))

## [1.1.38](https://github.com/w4bo/welaser/compare/1.1.37...1.1.38) (2022-10-19)


### Bug Fixes

* **deps:** update dependency mysql:mysql-connector-java to v8.0.31 ([7dc560d](https://github.com/w4bo/welaser/commit/7dc560d0330dcb5023e4731fb6d38f386867610b))


### Dependency updates

* **deps:** update dependency notebook to v6.5.1 ([f712480](https://github.com/w4bo/welaser/commit/f71248003843e05416c1601814cbef6315f84d4a))
* **deps:** update dependency pymongo to v4.3.2 ([15b8f9a](https://github.com/w4bo/welaser/commit/15b8f9aef530613819845a8bf7227e0e81437214))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.12 ([#273](https://github.com/w4bo/welaser/issues/273)) ([8721792](https://github.com/w4bo/welaser/commit/87217921c5b23a87a1b4928274e6f663836fd5e9))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.13 ([6f9ea58](https://github.com/w4bo/welaser/commit/6f9ea5841ee1b4f7685cf84b6b87f9d9f66902b1))
* **deps:** update node.js to 16.18 ([df6ffbb](https://github.com/w4bo/welaser/commit/df6ffbb0b07a9a73bcb7ecbb298d9637017a6a52))

## [1.1.37](https://github.com/w4bo/welaser/compare/1.1.36...1.1.37) (2022-10-12)


### Bug Fixes

* **demo:** Feature demo ([#271](https://github.com/w4bo/welaser/issues/271)) ([4ad6146](https://github.com/w4bo/welaser/commit/4ad6146e131492f455387862bb9f6ad77ca168dd))

## [1.1.36](https://github.com/w4bo/welaser/compare/1.1.35...1.1.36) (2022-10-11)


### Bug Fixes

* **deps:** update dependency io.github.microutils:kotlin-logging-jvm to v3.0.2 ([3d4db92](https://github.com/w4bo/welaser/commit/3d4db92c2e6793c0d9406fde2d98d7ddf0834882))


### Dependency updates

* **deps:** update dependency matplotlib to v3.6.1 ([6d9c786](https://github.com/w4bo/welaser/commit/6d9c786005b50c4676f2f1f88d7b0f5bfe42e1f9))

## [1.1.35](https://github.com/w4bo/welaser/compare/1.1.34...1.1.35) (2022-10-04)


### Bug Fixes

* **dataflow:** too many messages were generated ([03a5ab9](https://github.com/w4bo/welaser/commit/03a5ab989057213f14673b5338566bc2c9ae2a4c))


### Dependency updates

* **deps:** update openjdk docker tag to v12 ([798a5f2](https://github.com/w4bo/welaser/commit/798a5f2aa6c7c3ecdedb9374f286321d0bfa7e4c))
* **deps:** update openjdk docker tag to v13 ([abc18d9](https://github.com/w4bo/welaser/commit/abc18d91e91e9e9d3e0a7347f25ed2202022ff5e))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.1.0 ([1805694](https://github.com/w4bo/welaser/commit/18056946af538d2c3a320538cb8171edf9f92679))

## [1.1.34](https://github.com/w4bo/welaser/compare/1.1.33...1.1.34) (2022-10-03)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.3.1 ([11bc2b9](https://github.com/w4bo/welaser/commit/11bc2b95d3bfc6bb92b9be73a3ae7e7c9acd5046))

## [1.1.33](https://github.com/w4bo/welaser/compare/1.1.32...1.1.33) (2022-10-03)


### Bug Fixes

* **container:** update the java image ([#251](https://github.com/w4bo/welaser/issues/251)) ([15a8099](https://github.com/w4bo/welaser/commit/15a8099d6c7ea56d117c7aadeddd367a19d27c3e))

## [1.1.32](https://github.com/w4bo/welaser/compare/1.1.31...1.1.32) (2022-10-03)


### Bug Fixes

* **container:** containers can receive signals from the host ([#250](https://github.com/w4bo/welaser/issues/250)) ([a530af3](https://github.com/w4bo/welaser/commit/a530af31764e167d80c847fa2e6d1d61103edabe))

## [1.1.31](https://github.com/w4bo/welaser/compare/1.1.30...1.1.31) (2022-09-30)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.1.2 ([4757002](https://github.com/w4bo/welaser/commit/4757002192f41e32680889f79c61e3f67498ca6f))

## [1.1.30](https://github.com/w4bo/welaser/compare/1.1.29...1.1.30) (2022-09-30)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.1.2 ([640f626](https://github.com/w4bo/welaser/commit/640f626bd33428a1a8d05a06908f87098ba5070e))


### Dependency updates

* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.7.20 ([8c5ae3b](https://github.com/w4bo/welaser/commit/8c5ae3b326f502ff0e924fb636e217fac5ef0248))

## [1.1.29](https://github.com/w4bo/welaser/compare/1.1.28...1.1.29) (2022-09-29)


### Bug Fixes

* **mongo-db:** import the dumped database ([#242](https://github.com/w4bo/welaser/issues/242)) ([8f77b97](https://github.com/w4bo/welaser/commit/8f77b97c948450f82d049216533db0b7b2a610ba))

## [1.1.28](https://github.com/w4bo/welaser/compare/1.1.27...1.1.28) (2022-09-29)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.3.0 ([ef81b8e](https://github.com/w4bo/welaser/commit/ef81b8e9a1cb15ca7b56889b2526a4b96a17e6da))

## [1.1.27](https://github.com/w4bo/welaser/compare/1.1.26...1.1.27) (2022-09-28)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-api to v2.0.3 ([446bedf](https://github.com/w4bo/welaser/commit/446bedf99b6e6b151ff25f26387046eb711574cf))

## [1.1.26](https://github.com/w4bo/welaser/compare/1.1.25...1.1.26) (2022-09-28)


### Bug Fixes

* **mongodb:** add script to dump the database ([#240](https://github.com/w4bo/welaser/issues/240)) ([250fb3d](https://github.com/w4bo/welaser/commit/250fb3d86fb112fbc18eb35e3e149a1ecf07fa4a))

## [1.1.25](https://github.com/w4bo/welaser/compare/1.1.24...1.1.25) (2022-09-28)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-simple to v2.0.3 ([b49a6a7](https://github.com/w4bo/welaser/commit/b49a6a73ac6dda7de13e526c560870275f6eb0ec))

## [1.1.24](https://github.com/w4bo/welaser/compare/1.1.23...1.1.24) (2022-09-27)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-simple to v2 ([a2d9fda](https://github.com/w4bo/welaser/commit/a2d9fda36ddcffbafad7fda69db201284153b788))

## [1.1.23](https://github.com/w4bo/welaser/compare/1.1.22...1.1.23) (2022-09-27)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-api to v2 ([71c9a2d](https://github.com/w4bo/welaser/commit/71c9a2df9520cec48be791c0091a3fb452c14bfc))

## [1.1.22](https://github.com/w4bo/welaser/compare/1.1.21...1.1.22) (2022-09-27)


### Bug Fixes

* **welaser-datamodels:** update the datamodels ([#235](https://github.com/w4bo/welaser/issues/235)) ([9d4d49e](https://github.com/w4bo/welaser/commit/9d4d49e80b82e79879b486cfbccf61933fb21d7e))

## [1.1.21](https://github.com/w4bo/welaser/compare/1.1.20...1.1.21) (2022-09-27)


### Bug Fixes

* **device-python:** update the robot to receive commands ([#230](https://github.com/w4bo/welaser/issues/230)) ([51e8b9e](https://github.com/w4bo/welaser/commit/51e8b9e3e6626143b10efdcb4924cfa52b673dae))


### Dependency updates

* **deps:** update dependency gradle to v7.1.1 ([55fbd40](https://github.com/w4bo/welaser/commit/55fbd406473c1aeb1592d097aa4cbb3cf93494c3))
* **deps:** update dependency gradle to v7.5.1 ([e7559a8](https://github.com/w4bo/welaser/commit/e7559a833fc9ea2141302db5902902532eb31136))

## [1.1.20](https://github.com/w4bo/welaser/compare/1.1.19...1.1.20) (2022-09-25)


### Bug Fixes

* **deps:** update dependency org.json:json to v20220924 ([1cd2802](https://github.com/w4bo/welaser/commit/1cd28023b54a64e073c33cb7bb79f396c5a0895f))


### Dependency updates

* **deps:** update confluentinc/cp-kafkacat docker tag to v7.1.4 ([419bf55](https://github.com/w4bo/welaser/commit/419bf55d690011ca542f0145b6f5c11fe25e50cd))

## [1.1.19](https://github.com/w4bo/welaser/compare/1.1.18...1.1.19) (2022-09-22)


### Bug Fixes

* **deps:** update dependency com.fasterxml.jackson.module:jackson-module-kotlin to v2.13.4 ([bd215d1](https://github.com/w4bo/welaser/commit/bd215d16beaba19fbb36a4db27013074c3ffa6d4))

## [1.1.18](https://github.com/w4bo/welaser/compare/1.1.17...1.1.18) (2022-09-22)


### Bug Fixes

* **demo:** add scalability tests ([4c302f6](https://github.com/w4bo/welaser/commit/4c302f68889b245230bec446fce3c8c6aeeb3fae))

## [1.1.17](https://github.com/w4bo/welaser/compare/1.1.16...1.1.17) (2022-09-21)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-simple to v2.0.2 ([1bbc914](https://github.com/w4bo/welaser/commit/1bbc914da02c4202fe3a6ddf858286679b8ee862))

## [1.1.16](https://github.com/w4bo/welaser/compare/1.1.15...1.1.16) (2022-09-21)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-api to v2.0.2 ([3f342a6](https://github.com/w4bo/welaser/commit/3f342a66d09620f82258a43b941161f4ac4f4f5a))
* **deps:** update junit5 monorepo to v5.9.1 ([58cabaf](https://github.com/w4bo/welaser/commit/58cabafe48e336c1028da0714968042afa8df1ed))


### Dependency updates

* **deps:** update dependency pandas to v1.5.0 ([d410e2e](https://github.com/w4bo/welaser/commit/d410e2e4a118fd61fc57a97aa2d928206583fa70))

## [1.1.15](https://github.com/w4bo/welaser/compare/1.1.14...1.1.15) (2022-09-18)


### Bug Fixes

* **deps:** update dependency io.github.microutils:kotlin-logging-jvm to v3 ([249b51b](https://github.com/w4bo/welaser/commit/249b51ba8b623088cd07348abe4c5841add666ce))

## [1.1.14](https://github.com/w4bo/welaser/compare/1.1.13...1.1.14) (2022-09-17)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.2.3 ([fa763d9](https://github.com/w4bo/welaser/commit/fa763d9d34e9605306428334a7076276083fd1e9))


### Dependency updates

* **deps:** update dependency matplotlib to v3.6.0 ([1be4f2c](https://github.com/w4bo/welaser/commit/1be4f2ccf29fe35c003b84e2ec0a1f34d180d939))

## [1.1.13](https://github.com/w4bo/welaser/compare/1.1.12...1.1.13) (2022-09-15)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-simple to v2.0.1 ([af4ff4b](https://github.com/w4bo/welaser/commit/af4ff4b51e86b1d19704493664ae27014f580b17))

## [1.1.12](https://github.com/w4bo/welaser/compare/1.1.11...1.1.12) (2022-09-15)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-api to v2.0.1 ([d3c5e55](https://github.com/w4bo/welaser/commit/d3c5e557342cf904ab8da3476cd9f4bde8762c57))

## [1.1.11](https://github.com/w4bo/welaser/compare/1.1.10...1.1.11) (2022-09-14)


### Bug Fixes

* **demo:** update the demo for the integration testing ([e2dc1e1](https://github.com/w4bo/welaser/commit/e2dc1e14d0c2ec2872835431e11a3bc909039149))

## [1.1.10](https://github.com/w4bo/welaser/compare/1.1.9...1.1.10) (2022-09-09)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.2.2 ([16b5855](https://github.com/w4bo/welaser/commit/16b5855e03f7c63cd30dbf43ddd84f780d607005))

## [1.1.9](https://github.com/w4bo/welaser/compare/1.1.8...1.1.9) (2022-09-07)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.1.1 ([1c35261](https://github.com/w4bo/welaser/commit/1c35261d2df49ba08fc3813113be279381f1bf1c))

## [1.1.8](https://github.com/w4bo/welaser/compare/1.1.7...1.1.8) (2022-09-06)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.1.1 ([9a5980e](https://github.com/w4bo/welaser/commit/9a5980e2da5e2428addcb4eb44bb148695616253))

## [1.1.7](https://github.com/w4bo/welaser/compare/1.1.6...1.1.7) (2022-09-04)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-simple to v2 ([933ade3](https://github.com/w4bo/welaser/commit/933ade3ca3334c2fc03e1e552c06288d646ef40c))

## [1.1.6](https://github.com/w4bo/welaser/compare/1.1.5...1.1.6) (2022-09-04)


### Bug Fixes

* **deps:** update dependency org.slf4j:slf4j-api to v2 ([b167d81](https://github.com/w4bo/welaser/commit/b167d817cde0e5f56e62428d83207f9a6928c512))


### Dependency updates

* **deps:** update dependency python-dotenv to v0.21.0 ([06ad273](https://github.com/w4bo/welaser/commit/06ad273d10d47bb6de8247479c0e97c9b68fc11a))

## [1.1.5](https://github.com/w4bo/welaser/compare/1.1.4...1.1.5) (2022-09-03)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-netty to v2.1.0 ([d47c01e](https://github.com/w4bo/welaser/commit/d47c01e60a297b9da7f8bde83518972a2bbcf943))

## [1.1.4](https://github.com/w4bo/welaser/compare/1.1.3...1.1.4) (2022-09-03)


### Bug Fixes

* **deps:** update dependency io.ktor:ktor-server-core to v2.1.0 ([31a64cb](https://github.com/w4bo/welaser/commit/31a64cbe5f7ddfd91eb6f56f941becf602124297))

## [1.1.3](https://github.com/w4bo/welaser/compare/1.1.2...1.1.3) (2022-09-02)


### Bug Fixes

* **deps:** update junit5 monorepo to v5.9.0 ([94ea672](https://github.com/w4bo/welaser/commit/94ea672a4bf5395551cb6bed97574dee4241e7f0))


### Dependency updates

* **deps:** update dependency pymongo to v4.2.0 ([dfae2dc](https://github.com/w4bo/welaser/commit/dfae2dc1c376a4e9abc3b4e3a5e2d078c773127a))
* **deps:** update fiware/orion docker tag to v3.7.0 ([57691ad](https://github.com/w4bo/welaser/commit/57691adc27c387b9055891e5c5fcf1e968a3db79))
* **deps:** update mongo docker tag to v6 ([b5bc115](https://github.com/w4bo/welaser/commit/b5bc1150b9519fb7f811eed95f1b33cb779cf729))
* **deps:** update node.js to 16.17 ([af4f2fb](https://github.com/w4bo/welaser/commit/af4f2fb17f54cdd07f7c772a24c062fa6f9d8b98))

## [1.1.2](https://github.com/w4bo/welaser/compare/1.1.1...1.1.2) (2022-09-02)


### Bug Fixes

* **deps:** update dependency org.apache.kafka:kafka-clients to v3.2.1 ([7192857](https://github.com/w4bo/welaser/commit/71928576cd882dbfedf6979d0ec574f2f77309c2))


### Dependency updates

* **deps:** update confluentinc/cp-kafkacat docker tag to v7.1.3 ([8c09343](https://github.com/w4bo/welaser/commit/8c0934335268cba2d14126df5c14a7ba43aefaa3))
* **deps:** update dependency gradle to v7.5.1 ([b2169c0](https://github.com/w4bo/welaser/commit/b2169c095df9ffb7800fd200e7ec990f869e3eba))
* **deps:** update dependency pandas to v1.4.4 ([aa562eb](https://github.com/w4bo/welaser/commit/aa562eb44d76c5fb46ebdefa5bc10c1f31b38dea))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.11 ([bbaf736](https://github.com/w4bo/welaser/commit/bbaf736eebb533cd6bed0057b69b7e473f3cb338))
* **deps:** update dependency urllib3 to v1.26.12 ([15ecb0a](https://github.com/w4bo/welaser/commit/15ecb0aff03bf5589906084e7494a84791f4700f))

## [1.1.1](https://github.com/w4bo/welaser/compare/1.1.0...1.1.1) (2022-09-01)


### Bug Fixes

* **deps:** update dependency org.jetbrains.kotlinx:kotlinx-cli to v0.3.5 ([b5e4db6](https://github.com/w4bo/welaser/commit/b5e4db6b76e6b766fb42fcfa78ff606c624acc89))


### Build and continuous integration

* **deps:** update actions/setup-python action to v4 ([c3af57c](https://github.com/w4bo/welaser/commit/c3af57c6c508eec16bba72f556af8b3c18df537f))


### Dependency updates

* **deps:** bump semantic-release from 19.0.2 to 19.0.3 ([#173](https://github.com/w4bo/welaser/issues/173)) ([1f63baf](https://github.com/w4bo/welaser/commit/1f63baf5bd45ba71292a319c792e96241a392960))
* **deps:** update dependency confluentinc/cp-kafkacat to v7.1.2 ([227d36b](https://github.com/w4bo/welaser/commit/227d36bd05a13855a7a7ec00d1d6e249f169bfb8))
* **deps:** update dependency eclipse-mosquitto to v2.0.14 ([bb95e3b](https://github.com/w4bo/welaser/commit/bb95e3bf9ed9594ef375febe302b04df671a9495))
* **deps:** update dependency io.github.cdimascio:dotenv-kotlin to v6.3.1 ([1f1dab9](https://github.com/w4bo/welaser/commit/1f1dab957fd3d5b6066e2725c0d327dcca2daa47))
* **deps:** update dependency io.ktor:ktor-server-core to v2.0.2 ([dc426c6](https://github.com/w4bo/welaser/commit/dc426c6c5ef156b511bf707916684cebff2381ff))
* **deps:** update dependency io.ktor:ktor-server-core to v2.0.3 ([88fe626](https://github.com/w4bo/welaser/commit/88fe6262e55eb0e39ea1c7ed7e7377ceaab450b5))
* **deps:** update dependency io.ktor:ktor-server-netty to v2.0.2 ([4eb0b4a](https://github.com/w4bo/welaser/commit/4eb0b4a7560df57c0a4620cf4f4130a516c59a91))
* **deps:** update dependency io.ktor:ktor-server-netty to v2.0.3 ([074d140](https://github.com/w4bo/welaser/commit/074d140780277746b86c21e86c8726f2d3469345))
* **deps:** update dependency matplotlib to v3.5.3 ([71bb459](https://github.com/w4bo/welaser/commit/71bb459d7f6b5fa7810cd395227a7f3c0e7c7ea4))
* **deps:** update dependency notebook to v6.4.12 ([61a631c](https://github.com/w4bo/welaser/commit/61a631c6eb4c5c18a575e6b089f4a3eb74f74962))
* **deps:** update dependency org.slf4j:slf4j-api to v1.7.36 ([fa14942](https://github.com/w4bo/welaser/commit/fa1494232be7d39eda5f10bac82c8f17525863e0))
* **deps:** update dependency org.slf4j:slf4j-simple to v1.7.36 ([46773c0](https://github.com/w4bo/welaser/commit/46773c0eead7054be138390b5f475896d2ab3495))
* **deps:** update dependency pandas to v1.4.3 ([eb9fd13](https://github.com/w4bo/welaser/commit/eb9fd131e8bdd813b1e6ae8fb648160dd2e8c63a))
* **deps:** update dependency requests to v2.28.0 ([9e75867](https://github.com/w4bo/welaser/commit/9e75867a88692ba24c233f5567ebc6a7c5c92761))
* **deps:** update dependency requests to v2.28.1 ([f817e82](https://github.com/w4bo/welaser/commit/f817e8250901e5edb46ed56dfee0b0461912de8b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.7 ([4790852](https://github.com/w4bo/welaser/commit/47908521050f5831b857b57e6a1ba45ec631bd67))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.8 ([47e2c13](https://github.com/w4bo/welaser/commit/47e2c13bc08a6803d06004fa5ff8205a43746802))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.9 ([ef5db96](https://github.com/w4bo/welaser/commit/ef5db961606ad112d063e6c5e3b8114f7b0d11f7))
* **deps:** update dependency urllib3 to v1.26.10 ([ff4f190](https://github.com/w4bo/welaser/commit/ff4f190e661ed9830474f4b07abf0b80a6e896c8))
* **deps:** update dependency urllib3 to v1.26.11 ([deee40f](https://github.com/w4bo/welaser/commit/deee40fd0f4212ead929368ad7a869a2011771e1))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.7.0 ([a1c7c9e](https://github.com/w4bo/welaser/commit/a1c7c9ea3318364a3388e3674279bd6c9a5bad1c))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.7.10 ([643efaf](https://github.com/w4bo/welaser/commit/643efaf4a7a6f2194be6a7290dd7c3ceece9ec6c))
* **deps:** update welaser/welaser-datamodels digest to 2fab7c6 ([b9ff173](https://github.com/w4bo/welaser/commit/b9ff1736888dc5c0b06329e074de1b12da2af508))
* **deps:** update welaser/welaser-datamodels digest to 377aae6 ([318fdaf](https://github.com/w4bo/welaser/commit/318fdafb419828c15d688a6cae3ca01d84eed5da))

## [1.1.0](https://github.com/w4bo/welaser/compare/1.0.3...1.1.0) (2022-05-27)


### Features

* **agrirobot:** Feature pythonmockup ([#148](https://github.com/w4bo/welaser/issues/148)) ([46b2bbf](https://github.com/w4bo/welaser/commit/46b2bbfbba1148f2d7a68bed70251f7f95127c6d))


### Build and continuous integration

* **deps:** update actions/checkout action to v3.0.1 ([a4821a0](https://github.com/w4bo/welaser/commit/a4821a03dc733de396a83dd3d74afb0cb754d871))
* **deps:** update actions/checkout action to v3.0.2 ([de37495](https://github.com/w4bo/welaser/commit/de37495ea9be16350cebb3e93c905388aa1edc9e))


### Dependency updates

* **deps:** update dependency confluentinc/cp-kafkacat to v7.1.1 ([f4d9b5e](https://github.com/w4bo/welaser/commit/f4d9b5e47f106717add246ec3f3e8304550715c5))
* **deps:** update dependency io.github.microutils:kotlin-logging-jvm to v2.1.23 ([627aba0](https://github.com/w4bo/welaser/commit/627aba061a059e7b18da2ad5f998071fa97f1b12))
* **deps:** update dependency org.apache.kafka:kafka-clients to v3.2.0 ([2617a1b](https://github.com/w4bo/welaser/commit/2617a1bb5c6fa7e55d5d62523182df64a27ae622))
* **deps:** update dependency org.junit.jupiter:junit-jupiter to v5.8.2 ([1bacc03](https://github.com/w4bo/welaser/commit/1bacc03a6acf7379bdf8f958b4d983861545b210))
* **deps:** update dependency pymongo to v4.1.1 ([070e10b](https://github.com/w4bo/welaser/commit/070e10b9b358ab34216a6a6dd208a81152ba026b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.6 ([57b0f66](https://github.com/w4bo/welaser/commit/57b0f66686df8301dc35b3d0d94e8f6dc9e4b39e))
* **deps:** update node.js to 16.15 ([dd389fb](https://github.com/w4bo/welaser/commit/dd389fb0a6195f80cc4aaee51d1872798cf79d4a))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.6.21 ([f45b137](https://github.com/w4bo/welaser/commit/f45b137aedefcd756a8e1ce05d4c78466168b0d1))
* **deps:** update welaser/welaser-datamodels digest to 3814f01 ([9e98cf8](https://github.com/w4bo/welaser/commit/9e98cf841d5777bb51268df463130af1a51b2cf0))
* **deps:** update welaser/welaser-datamodels digest to 5338423 ([afb59e4](https://github.com/w4bo/welaser/commit/afb59e4a73fbeb6e5be72f172016f5b06cd27a97))
* **deps:** update welaser/welaser-datamodels digest to 977187e ([2823cdc](https://github.com/w4bo/welaser/commit/2823cdcb3d7258ed4466dbb83d0e7c5d47c51f09))

### [1.0.3](https://github.com/w4bo/welaser/compare/1.0.2...1.0.3) (2022-04-12)


### Bug Fixes

* **ci:** test java version ([#124](https://github.com/w4bo/welaser/issues/124)) ([4a02fbb](https://github.com/w4bo/welaser/commit/4a02fbb6431e4f6401e2c7b0d20d32d427e8c361))

### [1.0.2](https://github.com/w4bo/welaser/compare/1.0.1...1.0.2) (2022-04-07)


### Bug Fixes

* **mongodb:** use a single mongodb instance ([57d74c0](https://github.com/w4bo/welaser/commit/57d74c075449d0d09433443149046b42d5a0bc55))


### Dependency updates

* **deps:** update dependency confluentinc/cp-kafkacat to v7.1.0 ([fefb50f](https://github.com/w4bo/welaser/commit/fefb50f99f84f0a8a7afc9e2f2822c029f1379cb))

### [1.0.1](https://github.com/w4bo/welaser/compare/1.0.0...1.0.1) (2022-04-05)


### Bug Fixes

* **kafka:** add group id to consumers and fix topics in the dashboard ([d32980c](https://github.com/w4bo/welaser/commit/d32980cd25b1e9adb2ee34418cf5315f74226528))


### Dependency updates

* **deps:** update dependency fiware/iotagent-json to v1.17.2 ([22612f4](https://github.com/w4bo/welaser/commit/22612f40063f14c3f36b0760cd7a1e1886629e0f))
* **deps:** update dependency fiware/iotagent-json to v1.21.1 ([69dff33](https://github.com/w4bo/welaser/commit/69dff33c67bf9dc299837919f7db200b9231af25))
* **deps:** update dependency fiware/orion to v2.6.1 ([024dc39](https://github.com/w4bo/welaser/commit/024dc39d9e2fde075ed096c300bce486d0d53ff9))
* **deps:** update dependency fiware/orion to v3 ([3313f39](https://github.com/w4bo/welaser/commit/3313f39e0d1124f32aedca52f285ed91da548581))
* **deps:** update dependency pymongo to v4.1.0 ([2faf1fc](https://github.com/w4bo/welaser/commit/2faf1fc94f5cda86bf720dbf534ad9e494e04a25))

## 1.0.0 (2022-04-04)


### Bug Fixes

* add mqtt tests ([1497d41](https://github.com/w4bo/welaser/commit/1497d418ba7ed2b27b2035af5e55d92d28b51f54))


### Dependency updates

* **deps:** update dependency ansi-regex [security] ([f937b9a](https://github.com/w4bo/welaser/commit/f937b9ab57f3ded867cffcc94afc634274f7a6b5))
* **deps:** update dependency com.google.guava:guava to v31.1-jre ([0605a3b](https://github.com/w4bo/welaser/commit/0605a3bfc308b0e46abc36626401be73ed9a262d))
* **deps:** update dependency confluentinc/cp-kafkacat to v5.0.4 ([6c87d75](https://github.com/w4bo/welaser/commit/6c87d75ce9d7ddb70abf703dbe9ec5d464520fc0))
* **deps:** update dependency confluentinc/cp-kafkacat to v5.5.8 ([51029d7](https://github.com/w4bo/welaser/commit/51029d70749ac8d6e62179b589c0bf04060501cc))
* **deps:** update dependency confluentinc/cp-kafkacat to v6 ([3585424](https://github.com/w4bo/welaser/commit/3585424bf286efe4f37bd6322eade3226278424b))
* **deps:** update dependency confluentinc/cp-kafkacat to v7 ([923d1ae](https://github.com/w4bo/welaser/commit/923d1ae62c3d83de1e78dab6c19a5c1900f66861))
* **deps:** update dependency eclipse-mosquitto to v2.0.14 ([3ee7701](https://github.com/w4bo/welaser/commit/3ee7701877b9f6929da69cd5c2cf591262987be9))
* **deps:** update dependency gradle to v7.4.2 ([2f849dd](https://github.com/w4bo/welaser/commit/2f849dd807eee921e333ffd3ba3daf2b11f2ea3b))
* **deps:** update dependency minimist to 1.2.6 [security] ([1ae334c](https://github.com/w4bo/welaser/commit/1ae334ccf91a6cc06ca669af9fe481994bfd24ae))
* **deps:** update dependency mongo to v4.4 ([c14d22a](https://github.com/w4bo/welaser/commit/c14d22af8a1da109486f4df99ef17908a01c508b))
* **deps:** update dependency mongo to v5 ([c95954d](https://github.com/w4bo/welaser/commit/c95954d2912496facf40a16bf4a0cacbd29f091a))
* **deps:** update dependency org.apache.kafka:kafka-clients to v3.0.1 ([ebc22f8](https://github.com/w4bo/welaser/commit/ebc22f8e4f831a01d937a0f157087af0a95bf1c4))
* **deps:** update dependency org.apache.kafka:kafka-clients to v3.1.0 ([e5df442](https://github.com/w4bo/welaser/commit/e5df442bd9d4b20d2a6eb8b6d355334a7ab723c7))
* **deps:** update dependency pymongo to v4 ([705c61a](https://github.com/w4bo/welaser/commit/705c61a96e673f57d39ff8d5cf89d1fd37c8dff7))
* **deps:** update dependency python-dotenv to v0.20.0 ([42e1537](https://github.com/w4bo/welaser/commit/42e1537feca7a8530f2a3c166ce39f66110f7d3a))
* **deps:** update dependency requests to v2.27.1 ([1614f74](https://github.com/w4bo/welaser/commit/1614f742fa78165949869e7432719bbcede5b4de))
* **deps:** update dependency urllib3 to v1.26.9 ([64ad340](https://github.com/w4bo/welaser/commit/64ad3409ca63ea82a2b27dd03dec17148bafb4d5))
* **deps:** update dependency ws [security] ([da8441e](https://github.com/w4bo/welaser/commit/da8441e7572219726e1418ae2dff539f7b026d3c))
* **deps:** update junit5 monorepo to v5.3.2 ([07a80e5](https://github.com/w4bo/welaser/commit/07a80e595a4bd1dbe8f8253ff4e2a952f7217c9b))
* **deps:** update junit5 monorepo to v5.8.2 ([bea85aa](https://github.com/w4bo/welaser/commit/bea85aa36df39f15d6b4712284e044f355966f8e))
* **deps:** update plugin com.github.johnrengelman.shadow to v7 ([23e72df](https://github.com/w4bo/welaser/commit/23e72dfe157b40df01f190f2f6383524daadb0ee))
* **deps:** update plugin org.jetbrains.kotlin.jvm to v1.6.20 ([066eb78](https://github.com/w4bo/welaser/commit/066eb78633d8a3f72f51c67222f839f5ebacaaac))


### Build and continuous integration

* **deps:** update actions/checkout action to v3 ([639b4c5](https://github.com/w4bo/welaser/commit/639b4c5cb20592872bea84765af5cf39e5b15016))
