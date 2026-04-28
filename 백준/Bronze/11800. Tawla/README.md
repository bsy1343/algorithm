# [Bronze III] Tawla - 11800

[문제 링크](https://www.acmicpc.net/problem/11800)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 2483, 정답: 1287, 맞힌 사람: 1213, 정답 비율: 52.488%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>상근이와 창영이는 재미있는 주사위 게임을 하고 있다.</p>

<p>게임에서 사용되는 주사위는 2개를 사용하며&nbsp;1 부터 6 까지 존재하는 정육면체이다.</p>

<p>주사위의 각 면에는 다음과 같은 고유 별칭이 부여된다.</p>

<ul>
	<li>1 :&nbsp;&quot;Yakk&quot;</li>
	<li>2&nbsp;: &quot;Doh&quot;</li>
	<li>3 : &quot;Seh&quot;</li>
	<li>4 : &quot;Ghar&quot;</li>
	<li>5 : &quot;Bang&quot;</li>
	<li>6 : &quot;Sheesh&quot;</li>
</ul>

<p>상근이와 창영이가 주사위를&nbsp;한 개씩 던졌을 때 나온 수 중 큰 수부터 별칭을 부르면 된다</p>

<p>예를 들어 1 과 2 가 나오면 &quot;Doh Yakk&quot; , 3 과 5 가 나오면 &quot; Bang Seh&quot; , 6 과 4 가 나오면 &quot;Sheesh Ghar &quot;</p>

<p>단 두 수가 같은 수가 나오는 경우에는 다음과 같은 별칭을 부여한다</p>

<ul>
	<li>1 - 1 : &quot;Habb Yakk&quot; &nbsp; &nbsp;</li>
	<li>2 -&nbsp;2 :&nbsp;&quot;Dobara&quot;&nbsp;</li>
	<li>3&nbsp;-&nbsp;3 :&nbsp;&quot;Dousa&quot;</li>
	<li>4&nbsp;-&nbsp;4 :&nbsp;&quot;Dorgy&quot;</li>
	<li>5&nbsp;-&nbsp;5 :&nbsp;&quot;Dabash&quot;</li>
	<li>6&nbsp;-&nbsp;6 :&nbsp;&quot;Dosh&quot;</li>
</ul>

<p>어째서인지 주사위 수가&nbsp;6-5 ( 5-6&nbsp;) 이 나오는 경우에는 &quot;Sheesh Bang&quot; 은 어감이 좋지 않아서 &quot;Sheesh Bang&quot; 대신에 &quot;Sheesh Beesh&quot; 로 부르기로 하였다.</p>

<p>두 수가 주어질 때 상근이와 창영이가 외쳐야 할 문장을 출력하시오.</p>

### 입력

<p>첫 줄에는 전체 테스트 개수인&nbsp;T&nbsp;가 주어진다.&nbsp;(1 &le; T &le; 100)</p>

<p>그 다음줄부터는&nbsp;각 테스트에 주어지는 두 수 a , b 가 주어진다.&nbsp;(1 &le; a, b &le; 6)</p>

### 출력

<p>각 테스트마다 상근이와 창영이가 외쳐야 할 문장을 &quot;Case n:&quot; ( &quot;&quot;&nbsp;제외 ) 을 포함하여 출력하시오.</p>