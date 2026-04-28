# [Platinum III] Trous de loup - 18368

[문제 링크](https://www.acmicpc.net/problem/18368)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 120, 정답: 44, 맞힌 사람: 36, 정답 비율: 33.962%

### 분류

자료 구조, 덱, 누적 합, 두 포인터

### 문제 설명

<p>The King of Byteotia, Byteasar III the Bold, is planning a raid on enemy&rsquo;s castle. On three sides, the castle is surrounded by impenetrable moat, leaving Byteasar no other option than to lay siege to the fourth side of the castle. However, it turns out that this side is not completely unprotected either: the royal scouts have reported that there are deep trous de loup along this wall. Byteasar would like to attack a contiguous segment of the wall as long as possible. To this end, some of the trous de loup will have to be disarmed. The wise king has decided to fill up some of them with sand, and to cover some with the Great Plank.</p>

<p>Along the wall, there are n trous de loup. King Byteasar&rsquo;s troops have p sandbags. To fill up the i-th trou de loup, w<sub>i</sub> of the sandbags are required. Moreover, the Great Plank can cover up to d successive trous de loup.</p>

<p>Help Byteasar in identifying the longest segment of the wall that his troops may attack if they utilize their resources (i.e., the sandbags and the Great Plank) optimally. In other words, determine what is the maximum number of successive trous de loup that can be disarmed.</p>

### 입력

<p>The first line of the standard input contains three integers, n, p, and d (1 &le; d &le; n &le; 2 000 000, 0 &le; p &le; 10<sup>16</sup>), separated by single spaces, which specify the numbers of trous de loup and of sandbags, and the length of the Great Plank respectively.</p>

<p>The next lines describes the trous de loup: it contains a sequence of n integers, w<sub>1</sub>, w<sub>2</sub>, . . . , w<sub>n</sub> (1 &le; w<sub>i</sub> &le; 10<sup>9</sup>) separated by single spaces; w<sub>i</sub> is the number of sandbags required to fill up the i-th trou de loup. In tests worth 30% of the total score, an additional condition n &le; 3000 holds.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer: the length of the longest contiguous segment of the wall that Byteasar&rsquo;s troops can attack.</p>

### 힌트

<p>The trous de loup no. 2, 3, and 6 can be filled up with sand (using 6 out of the 7 bags available), whereas the ones no. 4 and 5 can be covered with the Great Plank. This way, five successive trous de loup (the ones no. 2 to 6) will be disarmed.</p>