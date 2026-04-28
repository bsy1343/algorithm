# [Platinum I] Estate Agent - 17798

[문제 링크](https://www.acmicpc.net/problem/17798)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 53, 맞힌 사람: 41, 정답 비율: 95.349%

### 분류

그래프 이론, 최대 유량, 최소 비용 최대 유량

### 문제 설명

<p>Rupert makes a living as the only real estate agent in a small town in England. He asks for 5% commission for every house that he sells.</p>

<p>Rupert organises one big auction per year. Every family (numbered from 1 to n) must participate in this action, although making or an accepting an offer is optional. Everyone puts in bids for the houses they would like to move to, provided they can sell their current house at the same time.</p>

<p>This is a very transparent process&ndash;Rupert can see exactly how much commission he will make if he accepts the right buyers&rsquo; offers on behalf of the sellers. He may discard some offers from buyers in order to drive up the overall commission. In fact, he might even decide to discard all of the offers from one family and let them stay in their current home, if it makes more money for him.</p>

<p>Find the maximum commission Rupert can make if he discards offers optimally.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line containing two integers n and m (1 &le; n &le; 150, 0 &le; m &le; n &times; (n &minus; 1)), the number of families on the market and the number of offers made.</li>
	<li>m lines, describing the offers. The ith such line contains three integers f<sub>i</sub>, h<sub>i</sub> and a<sub>i</sub> (1 &le; f<sub>i</sub>, h<sub>i</sub> &le; n, f<sub>i</sub>&nbsp;&ne;&nbsp;h<sub>i</sub>, 0 &le; a<sub>i</sub> &le; 10<sup>6</sup>), the family making the offer, the family that owns the house that the offer is for and the amount offered. No family makes more than one offer to the same house.</li>
</ul>

### 출력

<p>Output how much Rupert will earn via commissions if he discards offers optimally. Your answer must be accurate to an absolute or relative error of 10<sup>&minus;6</sup>.</p>