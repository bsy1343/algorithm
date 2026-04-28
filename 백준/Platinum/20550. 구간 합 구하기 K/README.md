# [Platinum II] 구간 합 구하기 K - 20550

[문제 링크](https://www.acmicpc.net/problem/20550)

### 성능 요약

시간 제한: 6 초  (하단 참고), 메모리 제한: 512 MB

### 통계

제출: 145, 정답: 35, 맞힌 사람: 26, 정답 비율: 25.243%

### 분류

자료 구조, 세그먼트 트리, 다차원 세그먼트 트리

### 문제 설명

<p>1~<i>N </i>범위의 정수&nbsp;<em>D</em><sub>1</sub>, <em>D</em><sub>2</sub>, ... , <em>D<sub>K</sub></em>&nbsp;에 대해 정수 <em>V</em>[<em>D</em><sub>1</sub>, <em>D</em><sub>2</sub>, ... , <em>D<sub>K</sub></em>]가 배정되어 있다.</p>

<p><em>V</em>에 대해 Q개의 쿼리를 처리할 것이고, 쿼리는 2가지 쿼리가 존재한다.</p>

<ul>
	<li><strong>1 <em>S</em><sub>1&nbsp;</sub><em>E</em><sub>1&nbsp;</sub><em>S</em><sub>2&nbsp;</sub><em>E</em><sub>2&nbsp;</sub>...&nbsp;<em>S<sub>K</sub><sub>&nbsp;</sub>E</em></strong><sub><em><strong>K</strong></em>&nbsp;</sub>: 1이상 <em>K</em>이하를 만족하는&nbsp;모든 정수&nbsp;<em>i</em>에 대해서, <em>A<sub>i</sub></em>&nbsp;값이 <em>S<sub>i</sub></em>&nbsp;이상이면서 <em>E</em><sub><em>i</em>&nbsp;</sub>이하를 모두 만족하는&nbsp;<em>V</em>[<em>A</em><sub>1</sub>, <em>A</em><sub>2</sub>, ... , <em>A<sub>K</sub></em>]들의 합을 출력한다.</li>
	<li><strong>2 <em>B</em><sub>1&nbsp;</sub><em>B</em><sub>2</sub>&nbsp;... <em>B<sub>k</sub>&nbsp;X</em></strong> :&nbsp;<em>V</em>[<em>B</em><sub>1</sub>,&nbsp;<em>B</em><sub>2</sub>,&nbsp;... ,&nbsp;<em>B<sub>k</sub></em>]를&nbsp;<em>X</em>로 변경한다.</li>
</ul>

### 입력

<p><em>N</em>, <em>K</em>, <em>Q</em>가 공백을 사이에 두고 한 줄에 주어진다.</p>

<p>2번째 줄에는 <em>V</em>에 배정되어있는 정수 <em>N<sup>K</sup></em>개가&nbsp;주어진다. 2번째 줄의&nbsp;<em>i</em>번째 수는&nbsp;<em>V</em>[<em>i&nbsp;</em>//&nbsp;<em>N<sup>K</sup></em><sup>-1</sup><em><sup>&nbsp;</sup></em>%&nbsp;<em>N&nbsp;</em>+ 1,&nbsp;<em>i </em>//&nbsp;<em>N<sup>K</sup></em><sup>-2</sup><em><sup>&nbsp;</sup></em>%&nbsp;<em>N&nbsp;</em>+ 1<em>, ...,&nbsp;i&nbsp;</em>//&nbsp;<em>N<sup>K</sup></em><sup>-</sup><em><sup>K&nbsp;</sup></em>%&nbsp;<em>N&nbsp;</em>+ 1]을 나타낸다. 2번째 줄의 제일 처음 나오는 수는 0번째 수이다. 즉,&nbsp;<em>i</em>는 0부터 시작한다. &#39;//&#39;연산자는 몫 연산자를 의미하고 &#39;%&#39;연산자는 나머지 연산자를 의미하며 &#39;//&#39;, &#39;%&#39;, &#39;+&#39; 세 연산자의 연산자&nbsp;우선순위는 같다.</p>

<p>그 다음 <i>Q</i>개의 줄에는 위에 설명된 2개중 하나의 쿼리가 한 줄에 하나씩 주어진다. (1번 쿼리는 최소 한 개 이상 주어진다)</p>

### 출력

<p>1번 쿼리가 주어졌을 때, 쿼리에 대한 올바른 값을 한 줄에 하나씩 출력한다.</p>

### 제한

<ul>
	<li>20 &le; <em>N</em></li>
	<li>1 &le; <em>K</em></li>
	<li><em>N</em><sup><em>K</em>&nbsp;</sup>&le; 5&times;10<sup>5</sup></li>
	<li><em>Q</em> &le; 10<sup>5</sup></li>
	<li>1 &le; <em>S<sub>i</sub>,</em> <em>E<sub>i</sub></em>, <em>A<sub>i</sub></em>,&le; <em>N</em></li>
	<li>0 &le;&nbsp;<em>V</em>[<em>D</em><sub>1</sub>, <em>D</em><sub>2</sub>, ... , <em>D<sub>K</sub></em>] , <em>X</em> &le; 10<sup>5</sup></li>
	<li>입력으로 주어지는 모든 수는 정수이다.</li>
</ul>