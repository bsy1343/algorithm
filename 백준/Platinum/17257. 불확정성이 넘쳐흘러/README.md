# [Platinum II] 불확정성이 넘쳐흘러 - 17257

[문제 링크](https://www.acmicpc.net/problem/17257)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 159, 정답: 67, 맞힌 사람: 54, 정답 비율: 38.028%

### 분류

수학, 정수론, 포함 배제의 원리, 소인수분해

### 문제 설명

<p>욱제는 대회 참가자들을 괴롭히기 위해 길이 N의 특이한 수열을 만들었다! 신기하게도, 이 수열의 원소들은 우리가 들여다보기 전까지는 확률적으로 존재할 뿐이며 여러 자연수들이 중첩된 상태로 존재한다. 이 수열의 원소들을 확정하기 위해서는&nbsp;<strong>관측</strong>이라는 특별한 과정이 필요하다.&nbsp;</p>

<p>자연수 <em>Y</em> &ge;2 와 닫힌 구간 [ℓ, r] 에 대해, <strong>관측</strong> 및 <strong>관측의 결과값</strong>이 다음과 같이 정의된다.</p>

<p>수열의 ℓ번째 원소부터 r번째 원소를 각각 <em>A<sub>ℓ</sub>, A<sub>ℓ+1</sub>, ..., A<sub>r</sub></em>라는 확률변수로 놓자. 어떤 <em>A<sub>i</sub></em> 를 <strong>관측</strong>하는 순간, <em>A<sub>i</sub></em> 는 닫힌 구간 [1, <em>Y</em>]에 속한 임의의 자연수로 고정되어&nbsp;<em>B<sub>i</sub></em>가 된다. (어떤 자연수가 고정될 확률은 모두 1/Y로 같다) <strong>관측</strong>은 각 원소마다 독립적으로 시행하며, 이를 통해 <em>A<sub>ℓ</sub>, A<sub>ℓ+1</sub>, ..., A<sub>r</sub></em>에서 <em>B<sub>ℓ</sub>,, B<sub>ℓ+1</sub>, ..., B<sub>r</sub></em>를 얻어낼 수 있다. <strong>관측의 결과값</strong>이란 <em>B<sub>ℓ</sub></em>, <em>B<sub>ℓ+1</sub></em>,<em> ...</em> ,<em> B<sub>r</sub></em>의 최대공약수를 뜻한다. 관측된 원소들은 곧바로 원래 상태로 돌아가 다시 확률적으로만 존재하게 되며, 이후의 관측에 어떠한 영향도 주지 않는다.</p>

<p>욱제는 이 수열을 이용해서 다음과 같은 특이한 함수를 정의했다.</p>

<p style="text-align: center;">\[f_Y(i, j) = \begin{cases} 0 &amp; \text{if $i &gt; j$} \\ \text{[i, j]를 관측한 결과가 Y와 서로소일 확률 } &amp; \text{otherwise} \end{cases}\]</p>

<p>이때 다음을 만족하는 정수 <em>Z</em>를 구해보자.</p>

<p style="text-align: center;">\[\sum\limits_{i=1}^{N}{\sum\limits_{j=1}^{N}{f_Y (i, j)}} = {Z\over Y^N}\]</p>

<p><em>Z</em>는 굉장히 커질 수 있으므로, 10<sup>9</sup> + 9로 나눈 나머지를 구해 출력한다.</p>

### 입력

<p>첫째 줄에 수열의 길이 <em>N</em>, 자연수 <em>Y</em>가 주어진다. (1 &le; N &le; 10<sup>5</sup>, 2 &le; Y &le; 10<sup>9</sup> )</p>

### 출력

<p>정수 <em>Z</em>를 10<sup>9</sup> + 9로 나눈 나머지를 출력한다.</p>