# [Silver III] Ribbon on the Christmas Present - 32999

[문제 링크](https://www.acmicpc.net/problem/32999)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 109, 정답: 81, 맞힌 사람: 72, 정답 비율: 77.419%

### 분류

구현, 그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>You are preparing a ribbon to decorate the Christmas present box. You plan to dye the ribbon, initially white, to make a stripe pattern of different shades of red. The ribbon consists of a number of sections, each of which should be dyed as planned.</p>

<p>You want to prepare the ribbon with the least number of dyeing steps. Contiguous sections of the ribbon can be dyed in one step with the same shade of red. A ribbon section already dyed with some shade of red can be overdyed with dyestuff of a darker shade; it is colored with that darker shade. Overdyeing with a lighter shade is, however, not allowed. As the ribbon is initially white, all the sections must be dyed at least once.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32999.%E2%80%85Ribbon%E2%80%85on%E2%80%85the%E2%80%85Christmas%E2%80%85Present/83499e4a.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32999-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 220px; height: 35px;"></p>

<p style="text-align: center;">Figure A.1. Stripe Pattern of Sample Input 1</p>

<p>Figure A.1 shows the pattern of Sample Input 1. The ribbon has six sections and the numbers in the sections mean the levels of shades to be dyed. Larger numbers mean darker shades. This can be made by three dyeing steps:</p>

<ol>
	<li>dye the entire ribbon with red dyestuff of shade level $50$,</li>
	<li>dye the second section from the left with darker shade dyestuff of level $100$, and then 3.</li>
	<li>dye the fifth section with dyestuff of level $100$.</li>
</ol>

<p>Write a program that computes the least number of dyeing steps to make the planned stripe pattern.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$n$</p>

<p>$d_1$ $d_2$ $\cdots$ $d_n$</p>
</blockquote>

<p>The test case starts with an integer $n$ ($1 ≤ n ≤ 100$), the number of sections of the ribbon. The second line contains $n$ integers, $d_1, d_2, \dots , d_n$, describing the planned shade levels of the $n$ sections. Here, $d_i$ means the planned shade level of the $i$-th section, which is between $1$ and $100$, inclusive, larger meaning darker.</p>

### 출력

<p>Output a line containing the least number of dyeing steps to make the planned stripe pattern.</p>