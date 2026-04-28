# [Platinum IV] Cards - 27348

[문제 링크](https://www.acmicpc.net/problem/27348)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 4, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

조합론, 포함 배제의 원리, 수학

### 문제 설명

<p>In the attic of grandparents&rsquo; home Neringa has found a set of cards. Each card has four capital Latin letters written on it as a $2 \times 2$ grid. The set has $N$ cards and all of them are distinct.</p>

<p>Neringa noticed that some cards may be placed next to each other so that the pairs of letters on both cards adjacent to the connecting edge would be identical.</p>

<p>Let&rsquo;s call the pairs of cards that could paired in the way described above as <em>matching</em>. To match a pair of cards it is allowed to move them but not allowed to rotate or flip. A card can form multiple matching pairs.</p>

<p><img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/88x90/5,40/-/preview/" style="width: 44px; height: 45px;" /> and <img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/88x90/155,39/-/preview/" style="width: 44px; height: 45px;" /> match: <img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/89x165/421,3/-/preview/" style="width: 44px; height: 82px;" />,</p>

<p><img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/88x90/5,265/-/preview/" style="width: 44px; height: 45px;" /> and <img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/88x90/155,265/-/preview/" style="width: 44px; height: 45px;" /> match: <img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/89x165/420,228/-/preview/" style="width: 44px; height: 82px;" />, <img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/89x165/552,228/-/preview/" style="width: 44px; height: 82px;" />, <img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/165x89/683,266/-/preview/" style="width: 82px; height: 44px;" />, <img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/165x89/892,266/-/preview/" style="width: 82px; height: 44px;" />,</p>

<p><img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/88x90/6,493/-/preview/" style="width: 44px; height: 45px;" /> and <img alt="" src="https://upload.acmicpc.net/84b8394b-6bb7-48fd-990a-2fac2df13f7c/-/crop/88x90/156,494/-/preview/" style="width: 44px; height: 45px;" /> do not match.</p>

<p>Figure 1: Matching and not matching pairs of cards. The second pair of cards can be matched in four different ways.</p>

<p>Calculate the amount of matching card pairs in the card set discovered by Neringa.</p>

### 입력

<p>The total amount of cards $N$ is given in the first row.</p>

<p>The remaining $2N$ rows describe the cards. Each of the rows contains two capital Latin letters. One card is described by two consecutive input rows.</p>

### 출력

<p>Output the amount of matching card pairs.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 26^{4} = 456\,976$</li>
</ul>