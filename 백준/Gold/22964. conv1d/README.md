# [Gold III] conv1d - 22964

[문제 링크](https://www.acmicpc.net/problem/22964)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 363, 정답: 118, 맞힌 사람: 94, 정답 비율: 31.438%

### 분류

수학

### 문제 설명

<p>2020년, 선린인터넷고등학교는 서울시 교육청에 의해 인공지능 분야 고등학교로 선정되었다. (<a href="https://enews.sen.go.kr/news/view.do?bbsSn=168814&amp;step1=3&amp;step2=1#none">보도 자료</a>)</p>

<p>종서는 인공지능 고등학교 재학생들의&nbsp;실력을 알아보기 위해 신경망에서 자주 사용하는 conv1d 연산과&nbsp;관련된 문제를 출제했다.</p>

<p>conv1d 연산은 &quot;입력 데이터&quot;라고 부르는 길이가 $N$인&nbsp;1차원 배열 $A$와, &quot;필터&quot;라고 부르는 길이가 $K$인&nbsp;1차원 배열 $B$를 피연산자로 갖는다. ($K&nbsp;\leq N$)</p>

<p>conv1d 연산의 결과 $R$은&nbsp;길이가 $N-K+1$인 1차원 배열이며, 배열의 각 원소는&nbsp;</p>

<p style="text-align: center;">$$R[i] = \displaystyle \sum_{j=0}^{K-1} A[i+j]B[j] = A[i]B[0] + A[i+1]B[1] + \cdots + A[i+K-1]B[K-1]$$</p>

<p>로 계산한다. 아래 그림은 $A = \left\{ 1,3,2,7,6 \right\}, B = \left\{ 5,4,7 \right\}$일 때&nbsp;conv1d를 수행한 결과이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22964.%E2%80%85conv1d/5b58b4c1.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22964.%E2%80%85conv1d/5b58b4c1.png" data-original-src="https://upload.acmicpc.net/175eef64-3601-422a-a23e-527b0cc037f9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 404px; width: 1000px;" /></p>

<p>여러분이 풀어야 하는 문제는 다음과 같다.</p>

<p>입력 데이터의 크기, 필터의 크기, 가능한 수의 범위를 의미하는 정수 $N, K, X$가 주어지면, 입력 데이터와 필터의 각 원소가 $1$ 이상 $X$ 이하의 정수일 때 가능한 모든 경우에 대해 conv1d를 수행한 결과의 합을 구해야 한다.</p>

<p>즉, 만들 수 있는 모든&nbsp;입력 데이터와 필터의 조합 $X^{N+K}$가지에 대해 conv1d를 수행한 결과의 합을 나타내는 $N-K+1$개의 정수를 출력하면 된다. 이때 결과가 너무 커질 수 있으므로 각 정수를&nbsp;$998\,244\,353$으로 나눈 나머지를&nbsp;출력한다.</p>

<p>길이가 $n$으로 동일한&nbsp;두 배열 $X, Y$의 합은 $\left\{&nbsp;X[0] + Y[0], X[1] + Y[1], \cdots , X[n-1] + Y[n-1] \right\}$으로 정의한다.</p>

### 입력

<p>첫째 줄에 입력 데이터의 길이, 필터의 길이, 가능한 수의 범위를 의미하는 정수&nbsp;$N, K, X$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>배열과 필터의&nbsp;각 원소가 $1$ 이상 $X$ 이하의 정수일 때, 가능한 모든 경우에 대해 conv1d를 수행한 결과의 합을 $998\,244\,353$으로 나눈 나머지를 나타내는 $N-K+1$개의 정수를 출력한다.</p>

### 제한

<ul>
	<li>$1 \leq K \leq N&nbsp;\leq 200\,000$</li>
	<li>$1 \leq X \leq 200\,000$</li>
</ul>