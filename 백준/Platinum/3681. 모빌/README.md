# [Platinum V] 모빌 - 3681

[문제 링크](https://www.acmicpc.net/problem/3681)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 156, 정답: 69, 맞힌 사람: 52, 정답 비율: 41.600%

### 분류

자료 구조, 문자열, 애드 혹, 집합과 맵, 파싱

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3681.%E2%80%85%EB%AA%A8%EB%B9%8C/b194b2ff.jpg" data-original-src="https://www.acmicpc.net/upload/images/mobile.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:240px; width:242px" />모빌은 평형의 원리를 이용한 조각이다. 모빌은 여러 개의 막대와 물체로 이루어져 있다. 물체는 막대의 끝에만 매달려 있을 수 있고, 막대도 실을 이용해서 다른 막대의 끝에 연결할 수 있다.&nbsp;</p>

<p>막대가 다른 막대에 연결되어 있는 경우에는 매달려있는 막대의 중앙과 연결되어 있다. 아래 그림은 모빌의 예이다. 숫자는 물체의 무게를 나타낸다.</p>

<p>균형을 맞추지 않은 모빌이 주어졌을 때, 최소 물체 몇 개의 무게를 바꾸면 모빌이 균형을 이루는지 구하는 프로그램을 작성하시오.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3681.%E2%80%85%EB%AA%A8%EB%B9%8C/ca1f66b3.png" data-original-src="https://www.acmicpc.net/upload/images/mobile2(1).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:206px; width:289px" /></p>

<p>물체의 무게는 임의의 음이 아닌 실수로 바꿀 수 있다. 위의 그림에서 무게 7인 물체의 무게를 3으로 바꾸면, 모빌이 균형을 이룬다. 따라서, 물체 1개만 무게를 바꾸면 된다.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 수가 주어진다. 테스트 케이스는 최대 100개이다.</p>

<p>각 테스트 케이스는 한 줄로 이루어져 있고, 아래와 같이 재귀적으로 표현한다.</p>

<pre>
&lt;expr&gt; ::= &lt;weight&gt; | &quot;[&quot; &lt;expr&gt; &quot;,&quot; &lt;expr&gt; &quot;]&quot;</pre>

<p>&lt;weight&gt;는 양의 정수로 10<sup>9</sup>보다 작은 양의 정수이다. [&lt;expr&gt;,&lt;expr&gt;]는 막대를 나타내 표현으로 두 표현은 막대의 양 끝을 나타낸다. 가장 위에 있는 막대와 가장 아래에 있는 막대 사이에 막대 개수 (두 막대 포함) 는 최대 16개이다.</p>

### 출력

<p>각 테스트 케이스 마다, 균형을 이루기 위해 무게를 바꿔야하는 물체의 최소 개수를 출력한다.</p>