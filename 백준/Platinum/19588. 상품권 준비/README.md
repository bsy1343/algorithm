# [Platinum V] 상품권 준비 - 19588

[문제 링크](https://www.acmicpc.net/problem/19588)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 341, 정답: 135, 맞힌 사람: 102, 정답 비율: 40.476%

### 분류

그리디 알고리즘, 정렬, 누적 합

### 문제 설명

<p>2120년에도 &ldquo;2120&nbsp;신촌지역 대학생 프로그래밍 대회 동아리 연합 여름대회&rdquo;가 성공적으로 개최된다. 올해 HI-ARC에서는 총 <em>N</em>명의 학회원이 참가를 희망한다. HI-ARC의 운영진들은 서로 다른 정수로 수치화된 모든 학회원의 &ldquo;실력&rdquo; 정보를 가지고 있으며, 이를 바탕으로 다음과 같은 방법으로 팀을 구성한다.</p>

<ol>
	<li>정확히 <i>a</i>개의 팀이 대회에 참가하며, 각&nbsp;팀의 팀원은&nbsp;<em>M</em>명이다.</li>
	<li>실력이 높은 상위&nbsp;<i>b</i>명은&nbsp;이번 대회의 출제진이 된다. 따라서 남은&nbsp;<em>N</em> &minus; <em>b</em>명의 학회원이 이번 대회에 참가할 수 있는 후보다.</li>
	<li>후보 중&nbsp;<em>M&nbsp;</em>&times;&nbsp;<i>a</i>명을 골라 최강의 팀 구성을&nbsp;만든다. 한 팀의 &ldquo;강력함&rdquo;은 그 팀의 모든 팀원들의 실력의 곱으로 정의된다. 최강의 팀 구성은 모든 팀의 &ldquo;강력함&rdquo;의 합이 최대가 되는 구성이다.</li>
</ol>

<p>HI-ARC에서는 대회 참가의 독려를 위해 모든 팀에게 소정의 상품권을 제공하는 이벤트를 준비하기로 하였다. 각 팀이 받는 상품권의 액수는, <strong>팀원들의 이름을 Bitwise XOR</strong>한 값과 같다. 알다시피 2120년 대한민국에서 모든 사람의 이름은 10<sup><span style="font-size: 10.8333px;">9&nbsp;</span></sup>이하의 자연수이다.</p>

<p>문제는 한 팀의 팀원 수인 <em>M</em>은 이미 결정되었지만, 아직 <em>a</em>와 <em>b</em>는 확정되지 않았다는 것이다. 따라서 HI-ARC 운영진들은 상품권을 총 얼마나 준비해야 할지 예산 계획을&nbsp;세우는 데 어려움을 겪고 있다. 대회 준비로 바쁜 운영진들을 대신하여, 다양한 <em>a</em>와 <em>b</em>의 후보에 대해서 준비해야 하는 상품권 액수의 총합을 구해보자.</p>

### 입력

<p>첫 번째&nbsp;줄에 대회에 참가하는 학회원의 수 <em>N</em>과 한 팀의 팀원 수 <em>M</em>가 주어진다. (1 &le;&nbsp;<em>M</em>&nbsp;&le;&nbsp;<em>N&nbsp;</em>&le; 100,000)</p>

<p>다음 <em>N</em>개의 줄에 걸쳐 각 학회원의 정보를 나타내는 정수 <i>x</i>, <i>y</i>가&nbsp;주어진다. <i>x</i>는 이&nbsp;학회원의 실력, <i>y</i>는 이 학회원의 이름이다.&nbsp;(1&nbsp;&le; <i>x</i>, <i>y</i>&nbsp;&le; 10<sup>9</sup>) 서로 다른 두 학회원의&nbsp;<em>x</em>가 같은 경우는 없다.</p>

<p>다음 줄에 쿼리의 개수 <em>Q</em>가 주어진다. (1&nbsp;&le;&nbsp;<em>Q</em> &le; 500,000)</p>

<p>다음 <em>Q</em>개의 줄에 쿼리의 정보를 나타내는 정수 <em>a<sub>i</sub></em>와 <em>b<sub>i</sub></em>가 주어진다. (1 &le; <em>a</em><sub><em>i</em>&nbsp;</sub>&le;&nbsp;<em>N</em>, 0 &le; <em>b<sub>i&nbsp;</sub></em>&lt; <em>N</em>) 최강의 팀 구성을 만드는 방법이 하나인 쿼리들만 주어진다.</p>

<p>입력의 양이 많은 편이므로 빠른 입력 함수의 사용을 권장한다.</p>

### 출력

<p><em>i&nbsp;</em>(1 &le; <i>i&nbsp;</i>&le; <em>Q</em>)번째 줄에 <em>a</em>&nbsp;= <em>a<sub>i</sub></em>이고&nbsp;<em>b</em>&nbsp;= <em>b<sub>i</sub></em>일 때 준비해야 하는 상품권 액수의 총합을 출력한다.&nbsp;</p>

### 힌트

<p><a href="https://en.wikipedia.org/wiki/Bitwise_operation#XOR">Bitwise XOR</a>은 두 값을 이진수로 표현하고 자리 단위로 적용되는 이진 연산자로, 두 피연산자의 각 자릿수를 비교하며 같으면 1, 다르면 0을 계산한다. C/C++, Java, Python에서 두 정수 <code>x</code>와 <code>y</code>의 Bitwise XOR 결과는 <code><span style="background-color:#dddddd;">(x ^ y)</span></code>로 계산 할 수 있다.</p>