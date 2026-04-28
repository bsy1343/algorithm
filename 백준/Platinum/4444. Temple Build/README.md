# [Platinum V] Temple Build - 4444

[문제 링크](https://www.acmicpc.net/problem/4444)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 97, 정답: 25, 맞힌 사람: 19, 정답 비율: 39.583%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The Dwarves of Middle Earth are renowned for their delving and smithy ability, but they are also master builders. During the time of the dragons, the dwarves found that above ground the buildings that were most resistant to attack were truncated square pyramids (a square pyramid that does not go all the way up to a point, but instead has a flat square on top).</p>

<p>The dwarves knew what the ideal building shape should be based on the height they wanted and the size of the square base at the top and bottom. They typically had three different sizes of cubic bricks with which to work. Their goal was to maximize the volume of such a building based on the following rules:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4444.%E2%80%85Temple%E2%80%85Build/c3a2d433.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4444.%E2%80%85Temple%E2%80%85Build/c3a2d433.png" data-original-src="https://www.acmicpc.net/upload/images2/temple.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:178px; width:285px" />The building is constructed of layers; each layer is a single square of bricks of a single size. No part of any brick may extend out from the ideal shape, either to the sides or at the top. The resulting structure will have jagged sides and may be shorter than the ideal shape, but it must fit completely within the ideal design. The picture at the right is a vertical cross section of one such tower.</p>

<p>There is no limit on how many bricks of each type can be used.</p>

### 입력

<p>Each line of input will contain six entries, each separated by a single space. The entries represent the ideal temple height, the size of the square base at the bottom, the size of the square base at the top (all three as non-negative integers less than or equal to one million), then three sizes of cubic bricks (all three as non-negative integers less than or equal to ten thousand). Input is terminated upon reaching end of file.</p>

### 출력

<p>For each line of input, output the maximum possible volume based on the given rules, one output per line.</p>