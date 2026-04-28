# [Silver IV] Buy One Get One Free - 6230

[문제 링크](https://www.acmicpc.net/problem/6230)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 499, 정답: 248, 맞힌 사람: 190, 정답 비율: 50.132%

### 분류

그리디 알고리즘, 정렬, 두 포인터

### 문제 설명

<p>Farmer John has discovered the Internet is buying bales of hay online when he notices a special deal. For every bale of hay of size A (1 &lt;= A &lt;= 1,000,000) he buys, he can get a bale of hay of size B (1 &lt;= B &lt; A) for free!</p>

<p>The deal, however, is restricted: the larger bale must be high quality hay and the smaller one must be low quality hay. FJ, being a frugal and thrifty fellow, does not care: any quality of hay will do as long as he saves some money.</p>

<p>Given a list of the sizes of N (1 &lt;= N &lt;= 10,000) bales of high quality hay and M (1 &lt;= M &lt;= 10,000) bales of low quality hay, find the maximum number of bales of hay Farmer John can purchase. &nbsp;He can buy bales of high quality hay without getting the free bale of low quality hay, but he cannot buy bales of low quality hay (i.e., he must get them for free in the deal).</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M.</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer which is the size of the ith bale of high quality hay.</li>
	<li>Lines N+2..N+M+1: Line i+N+1 contains a single integer which is the size of the ith bale of low quality hay.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The maximum total number of bales of hay Farmer John can obtain.</li>
</ul>

### 힌트

<p>Obviously, Farmer John can buy all the bales of high quality hay. When he buys the size 6 high quality bale, he can get any low quality bale for free (say, the bale of size 3). When he buys the size 3 high quality bale, he can get the size 1 low quality bale for free. When he buys the size 1 high quality bale, however, he cannot get any low quality bales for free (since the size must be strictly less). The total, no matter how clever FJ is, comes to five bales.</p>