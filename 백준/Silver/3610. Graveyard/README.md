# [Silver II] Graveyard - 3610

[문제 링크](https://www.acmicpc.net/problem/3610)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 86, 정답: 63, 맞힌 사람: 37, 정답 비율: 72.549%

### 분류

수학, 그리디 알고리즘, 애드 혹

### 문제 설명

<p>Programming contests became so popular in the year 2397 that the governor of New Earck &mdash; the largest human-inhabited planet of the galaxy &mdash; opened a special Alley of Contestant Memories (ACM) at the local graveyard. The ACM encircles a green park, and holds the holographic statues of famous contestants placed equidistantly along the park perimeter. The alley has to be renewed from time to time when a new group of memorials arrives.</p>

<p>When new memorials are added, the exact place for each can be selected arbitrarily along the ACM, but the equidistant disposition must be maintained by moving some of the old statues along the alley.</p>

<p>Surprisingly, humans are still quite superstitious in 24th century: the graveyard keepers believe the holograms are holding dead people souls, and thus always try to renew the ACM with minimal possible movements of existing statues (besides, the holographic equipment is very heavy). Statues are moved along the park perimeter. Your work is to find a renewal plan which minimizes the sum of travel distances of all statues. Installation of a new hologram adds no distance penalty, so choose the places for newcomers wisely!</p>

### 입력

<p>Input file contains two integer numbers: n &mdash; the number of holographic statues initially located at the ACM, and m &ndash; the number of statues to be added (2 &le; n &le; 1000, 1 &le; m &le; 1000). The length of the alley along the park perimeter is exactly 10 000 feet.</p>

### 출력

<p>Write a single real number to the output file &mdash; the minimal sum of travel distances of all statues (in feet). The answer must be precise to at least 4 digits after decimal point.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3610.%E2%80%85Graveyard/c5bf51ac.png" data-original-src="https://www.acmicpc.net/upload/images2/graveyard.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:148px; width:555px" /></p>

<p>Pictures show the first three examples. Marked circles denote original statues, empty circles denote new equidistant places, arrows denote movement plans for existing statues.</p>