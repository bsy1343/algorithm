# [Platinum IV] f(k, n) - 17084

[문제 링크](https://www.acmicpc.net/problem/17084)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 346, 정답: 75, 맞힌 사람: 66, 정답 비율: 21.290%

### 분류

수학, 구현

### 문제 설명

<p><em>1&nbsp;</em>이상의 정수 <em>n</em>에 대하여 수열 <em>fib(n)</em>이 다음과 같이 정의되어있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17084.%E2%80%85f(k%2C%E2%80%85n)/6539bd62.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17084.%E2%80%85f(k%2C%E2%80%85n)/6539bd62.png" data-original-src="https://upload.acmicpc.net/6b8dfec8-e0ab-4c96-966d-9de272986b9c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 291px; height: 46px;" /></p>

<p>위 수열은 피보나치 수열로 너무 잘 알려져 있기 때문에 영훈이는 1&nbsp;이상인 정수 <em>n</em>, <em>k&nbsp;</em>에 대한 함수&nbsp;<em>f(k, n) </em>를&nbsp;다음과 같이 정의했다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17084.%E2%80%85f(k%2C%E2%80%85n)/daee09eb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17084.%E2%80%85f(k%2C%E2%80%85n)/daee09eb.png" data-original-src="https://upload.acmicpc.net/3ef929e5-c2c1-4766-b59f-52ffa8ea538f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 306px; height: 46px;" /></p>

<p>영훈이는 임의의 <em>p&times;p&nbsp;</em>행렬 <em>T</em>가 주어졌을 때, 다음 조건을 만족시키는 순서쌍 <em>(x, y)</em>의 갯수가 궁금해졌다.</p>

<ul>
	<li><em>t<sub>i-1,&nbsp;j-1</sub>&nbsp;&nbsp;</em>:= 행렬 <em>T</em>의 <em>i</em>번째 행, <em>j</em>번째 열의 원소</li>
	<li><em>f(x+i, y+j) </em>=<em> t<sub>i, j</sub>&nbsp; &nbsp; &nbsp; </em>(<em>for all&nbsp; 0 </em>&le;<em>&nbsp; i, j&nbsp; </em>&lt;<em> p</em>)</li>
	<li>1 &le;<em>&nbsp; x, y&nbsp; </em>&le;<em>&nbsp; n - p + </em>1</li>
</ul>

<p>택희 : ..이 문제는 너무 많은 수학 지식을 요구하니까 출제하지 말자.</p>

<p>영훈 : 아냐, 잘 봐. 이게 무슨 뜻이냐면..</p>

<p>택희 : ??</p>

<p>영훈 : ??</p>

<p>택희 : 괜찮은 문제였구나..</p>

### 입력

<p>첫째 줄에 <em>n</em>,&nbsp;<em>p</em>가 주어진다. (1 &le; <i>n</i>&nbsp;&le; 10<sup>9</sup>, 1 &le; <em>p</em> &le; 1000)</p>

<p>둘째 줄부터 <em>p</em>개의 줄에 걸쳐 <em>p</em>개의 정수가 주어진다. 이 중 <em>i</em>번째 줄 <em>j</em>번째 정수는 <em>t<sub>i-1,&nbsp;j-1</sub>&nbsp;</em>을 의미하며, 모두 절댓값이 10<sup>18</sup> 이하인 정수이다.</p>

### 출력

<p>문제의 정답을 출력한다.</p>