# [Platinum IV] 롯데 자이언츠와 가희 - 20653

[문제 링크](https://www.acmicpc.net/problem/20653)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 512 MB

### 통계

제출: 234, 정답: 69, 맞힌 사람: 55, 정답 비율: 32.738%

### 분류

수학, 정수론, 조합론, 포함 배제의 원리

### 문제 설명

<p>작년 7월 28일, 야구 시즌에는 항상 그랬듯, 가희는 롯데 야구를 보고 있었습니다. 그런데 갑자기,&nbsp;TV 화면에 수학 문제&nbsp;<strong><em>T</em></strong> 개가 나타났습니다.</p>

<p>9회 말이 막 시작해서&nbsp;당황한 가희는 여러분들에게 TV 화면에 나타난 [문제]<strong>&nbsp;<em>T</em> </strong>개를&nbsp;빠르게 풀어 달라고 요청하였습니다.</p>

<p>[문제] 조건을 만족하는 수열의 개수를 구해주세요.</p>

<ul>
	<li>수열의 길이는&nbsp;<em>n</em>&nbsp;입니다.</li>
	<li>수열에 있는&nbsp;모든 수는 <strong>0보다 큰&nbsp;자연수</strong>입니다.</li>
	<li>수열에 있는 수들의&nbsp;최대공약수는&nbsp;<em>G</em>&nbsp;입니다.</li>
	<li>수열에 있는 수들의&nbsp;최소공배수는&nbsp;<em>L</em>&nbsp;입니다.</li>
</ul>

<p>[문제]는 TV 화면에서 <code>n G L</code> 1줄로 표시됩니다.</p>

### 입력

<p>첫째 줄에 TV 화면에 나타난 문제의 수&nbsp;<em>T&nbsp;</em>가 주어집니다.</p>

<p>둘째 줄부터&nbsp;<em>T+1&nbsp;</em>번째 줄까지, TV 화면에 나타난 문제에 대한 정보가 <code>n G L</code>의 형식으로 입력됩니다. 이 수들은 <strong>공백으로 구분</strong>됩니다.</p>

### 출력

<p>각 문제에 대한 답을 10<sup>9</sup>+7 (1,000,000,007)로 나눈 나머지를 한 줄에 하나씩 출력하세요.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<em>T&nbsp;</em>&le; 100</li>
	<li>2 &le;&nbsp;<em>n</em>&nbsp;&le;&nbsp;10<sup>6</sup></li>
	<li>1 &le; <i>G, L</i>&nbsp;&le;&nbsp;10<sup>9</sup></li>
</ul>