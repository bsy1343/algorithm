# [Platinum IV] Automatic Accountant - 17794

[문제 링크](https://www.acmicpc.net/problem/17794)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 73, 정답: 40, 맞힌 사람: 34, 정답 비율: 51.515%

### 분류

자료 구조, 세그먼트 트리, 스위핑

### 문제 설명

<p>The bank you work in has purchased an advanced technological solution to the problems it has with counting money deposited by clients. The machine works by running each individual coin along a sloped track. At every integer multiple of centimetres along, starting from 1cm, there is a slot in the track with a bucket underneath.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17794.%E2%80%85Automatic%E2%80%85Accountant/e74fda2f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17794.%E2%80%85Automatic%E2%80%85Accountant/e74fda2f.png" data-original-src="https://upload.acmicpc.net/33362a9b-8220-4b35-8f9f-c5eb5c8b5b8e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 258px; height: 202px;" /></p>

<p>The slot will allow a coin to fall in, if the thickness of the coin (in millimetres) is less than or equal to the width of the slot (also in millimetres), and the mass of the coin (in grams) is greater than or equal to the trigger mass of the slot (also in grams).</p>

<p>Since the slots are spaced 1cm apart centre-to-centre, and since there can be a large number of coins (or other metal shapes) inserted, the amount of wear on the track will depend on total distance travelled by all coins.</p>

<p>Given a list of the coins that will be deposited, what total distance will they travel, in centimetres?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line containing the number of slots, s (1 &le; s &le; 10<sup>5</sup>).</li>
	<li>s further lines, the ith line containing the width of a slot in millimetres and trigger mass in grams of the ith slot, a<sub>i</sub> and b<sub>i</sub> respectively (1 &le; a, b &le; 10<sup>5</sup>).</li>
	<li>one line containing the integer c (1 &le; c &le; 10<sup>5</sup>), the number of coins.</li>
	<li>c further lines, the jth line containing the thickness in millimetres and mass in grams of the jth coin, u<sub>i</sub> and v<sub>i</sub> respectively (1 &le; u, v &le; 10<sup>5</sup>).</li>
</ul>

<p>It is guaranteed that every coin will be able to fall into at least one slot.</p>

### 출력

<p>Output the total distance in centimetres travelled by coins.</p>