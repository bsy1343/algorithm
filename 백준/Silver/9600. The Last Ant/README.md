# [Silver I] The Last Ant - 9600

[문제 링크](https://www.acmicpc.net/problem/9600)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 28, 맞힌 사람: 27, 정답 비율: 81.818%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>A straight tunnel without branches is crowded with busy ants coming and going. Some ants walk left to right and others right to left. All ants walk at a constant speed of 1 cm/s. When two ants meet, they try to pass each other. However, some sections of the tunnel are narrow and two ants cannot pass each other. When two ants meet at a narrow section, they turn around and start walking in the opposite directions. When an ant reaches either end of the tunnel, it leaves the tunnel.</p>

<p>The tunnel has an integer length in centimeters. Every narrow section of the tunnel is integer centimeters distant from the both ends. Except for these sections, the tunnel is wide enough for ants to pass each other. All ants start walking at distinct narrow sections. No ants will newly enter the tunnel. Consequently, all the ants in the tunnel will eventually leave it. Your task is to write a program that tells which is the last ant to leave the tunnel and when it will.</p>

<p>Figure B.1 shows the movements of the ants during the first two seconds in a tunnel 6 centimeters long. Initially, three ants, numbered 1, 2, and 3, start walking at narrow sections, 1, 2, and 5 centimeters distant from the left end, respectively. After 0.5 seconds, the ants 1 and 2 meet at a wide section, and they pass each other. Two seconds after the start, the ants 1 and 3 meet at a narrow section, and they turn around.</p>

<p>Figure B.1 corresponds to the first dataset of the sample input.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9600.%E2%80%85The%E2%80%85Last%E2%80%85Ant/821dbdc5.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9600/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:279px; width:451px" /></p>

<p style="text-align:center">Figure B.1. Movements of ants</p>

### 입력

<p>The input consists of one or more datasets. Each dataset is formatted as follows.</p>

<pre>
n l
d<sub>1</sub> p<sub>1</sub>
d<sub>2</sub> p<sub>2</sub>
.
.
.
d<sub>n</sub> p<sub>n</sub></pre>

<p>The first line of a dataset contains two integers separated by a space. n (1 &le; n &le; 20) represents the number of ants, and l (n + 1 &le; l &le; 100) represents the length of the tunnel in centimeters. The following n lines describe the initial states of ants. Each of the lines has two items, d<sub>i</sub> and p<sub>i</sub>, separated by a space. Ants are given numbers 1 through n. The ant numbered i has the initial direction d<sub>i</sub> and the initial position p<sub>i</sub>. The initial direction d<sub>i</sub> (1 &le; i &le; n) is L (to the left) or R (to the right). The initial position p<sub>i</sub> (1 &le; i &le; n) is an integer specifying the distance from the left end of the tunnel in centimeters. Ants are listed in the left to right order, that is, 1 &le; p<sub>1</sub> &lt; p<sub>2</sub> &lt; &middot;&middot;&middot; &lt; p<sub>n</sub> &le; l &minus; 1.</p>

<p>The last dataset is followed by a line containing two zeros separated by a space.</p>

### 출력

<p>For each dataset, output how many seconds it will take before all the ants leave the tunnel, and which of the ants will be the last. The last ant is identified by its number. If two ants will leave at the same time, output the number indicating the ant that will leave through the left end of the tunnel.</p>