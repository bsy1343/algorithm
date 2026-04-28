# [Platinum IV] Flipping El-fetiera - 18709

[문제 링크](https://www.acmicpc.net/problem/18709)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 85, 정답: 32, 맞힌 사람: 24, 정답 비율: 51.064%

### 분류

조합론, 다이나믹 프로그래밍, 기댓값의 선형성, 수학, 확률론

### 문제 설명

<p>Fouad was craving for Fetiera, so he went to a Fetier restaurant and ordered one. The chef told him that he sells a square Fetiera in the form of a N &times; N matrix.</p>

<p>On the surface of the Fetiera, there is one Semsema on each 1 &times; 1 cell of the Fetiera. Each Semsema can be either on the top side or the bottom side of the Fetira, but he cannot have two Semsemas in one cell on both sides.</p>

<p>Fouad loves to watch the chef flipping Fetiera, and this one was way more interesting than usual. The chef chooses a random (uniformly at random) rectangular submatrix and flips it in place. Whenever he flips a submatrix of the Fetira, the Semsemas which were on top will be on the bottom and vice versa.</p>

<p>Given the initial state of the Fetiera, and knowing that the chef did the flipping K times, Fouad was wondering how many Semsemas will be on the top side of it. Therefore, he is asking you to help him find the expected number of Semsemas on the top side.</p>

### 입력

<p>The first line of input contains a single integer T specifying the number of test cases.</p>

<p>Each test case begins with a line containing two space-separated integers N and K (1 &le; N &le; 300, 0 &le; K &le; 300), in which N is the size of the Fetiera matrix, and K is the number of flipping operations.</p>

<p>Then N lines follow, each line i contains N space-separated values F<sub>i1</sub>, &middot; &middot; &middot; , F<sub>iN</sub> (F<sub>ij</sub> &isin; {0, 1}), in which F<sub>ij</sub> representing the top side of the j<sup>th</sup> cell in the i<sup>th</sup> row of the Fetiera (1 means the Semsema is on the top side and 0 means the Semsema is on the bottom side in the initial configuration).</p>

### 출력

<p>For each test case, print a single line containing a single decimal number (rounded to exactly 5 decimal places) representing the expected number of Semsemas on the Fetiera after making the flipping operation for exactly K times.</p>