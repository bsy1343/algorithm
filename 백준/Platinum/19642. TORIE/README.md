# [Platinum V] TORIE - 19642

[문제 링크](https://www.acmicpc.net/problem/19642)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 129, 정답: 64, 맞힌 사람: 36, 정답 비율: 42.857%

### 분류

구현, 문자열, 트리, 파싱, 재귀

### 문제 설명

<p>TORIE는 <strong>[ABC]</strong> 와 같이 여는 대괄호 [ , 하나 이상의 영어 대문자, 닫는 대괄호 ] 형식의 문자열이며, 자식 TORIE를 가질 수 있다. TORIE가 자식 TORIE를&nbsp;가진 경우, 영어 대문자 문자열 다음에 자식 TORIE가 등장한다. <strong>[A[B][C]]</strong> 는 B TORIE, C TORIE를 자식으로 가지고 있는 A TORIE를 표현한 것이다. 자식 TORIE 역시 대괄호로 감싸진 문자열&nbsp;형식 및&nbsp;자식 TORIE를 가질 수 있다는 TORIE의 성질을 똑같이 갖는다.</p>

<p>키워드로 TORIE를 제거할 수 있는데, 방법은 아래와 같다.</p>

<ul>
	<li>한 TORIE의 영어 대문자 문자열의 한 지점에서 시작한 부분 문자열이 키워드와 일치한다면 해당 TORIE를 제거할 수 있다.</li>
	<li>만약 TORIE의 영어 대문자 문자열의 한 지점에서 만들 수 있는 부분 문자열의 최대 길이가 키워드보다 짧다면, 자식 TORIE 중 한 TORIE의 영어 대문자 문자열 앞에&nbsp;부분 문자열을 이어나갈 수 있다. 위의 조건을 연달아&nbsp;충족한다면 자식 TORIE에서 그 자식 TORIE로 이어나가는 것의 연속 또한 가능하다. 이어나간 부분 문자열이 키워드와 일치한다면 부분 문자열이&nbsp;시작된 TORIE를 제거할 수 있다.</li>
	<li>키워드를 통한 TORIE 제거는 여러 번 할 수 있으며, 어떤 TORIE가 제거될 때 자식 TORIE까지 모두 제거된다.</li>
</ul>

<p>키워드를 이용하여 최대한 적은 TORIE가 남도록 제거하고 남은 TORIE를 입력된 순서대로 출력하라. 단, 모든 TORIE가 제거됐다면 <code><span style="color:#e74c3c;"><span style="background-color:#ecf0f1;">torie!</span></span></code>를 출력한다.</p>

### 입력

<p>첫 번째 줄에는 1개 이상의 TORIE를 나타내는 문자열이&nbsp;주어진다. 문자열의 총 길이는 3 이상, 10<sup>6</sup>&nbsp;이하이다. TORIE가 성립하지 않는&nbsp;경우는 입력으로 주어지지 않는다.</p>

<p>두 번째 줄에는 키워드 문자열이&nbsp;주어진다. 이 문자열은&nbsp;영어 대문자로만 이루어져 있으며, 길이는 1 이상, 20 이하다.</p>

### 출력

<p>작업을 모두 마치고 남은 TORIE를 입력된 순서대로&nbsp;출력한다. 모든 TORIE가 제거됐다면&nbsp;<span style="color:#e74c3c;"><code><span style="background-color:#ecf0f1;">torie!</span></code></span>를 출력한다.</p>