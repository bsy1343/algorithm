# [Platinum V] 다항 계수 - 16725

[문제 링크](https://www.acmicpc.net/problem/16725)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 730, 정답: 204, 맞힌 사람: 153, 정답 비율: 27.518%

### 분류

수학, 다이나믹 프로그래밍, 누적 합, 조합론

### 문제 설명

<p><strong>다항 정리</strong>(multinomial theorem)는 다항식의 거듭제곱을 전개하는 정리이며, 전개식의 계수를 <strong>다항 계수</strong>(multinomial coefficient)라고 한다. 우리가 다룰 다항식은 모든 항의 계수가 1인 경우이고, 아래는 그 예시이다.</p>

<p style="text-align: center;">(1 + x + x<sup>2</sup>)<sup>3</sup> = 1 + 3x + 6x<sup>2</sup> + 7x<sup>3</sup> + 6x<sup>4</sup> + 3x<sup>5</sup> + x<sup>6</sup></p>

<p>다항정리를 일반화 하면, 다음과 같이 나타낼 수 있다.</p>

<p style="text-align: center;">(1 + x + ... + x<sup>n</sup>)<sup>m</sup> = a<sub>0</sub>x<sup>0</sup>&nbsp;+ a<sub>1</sub>x<sup>1</sup>&nbsp;+ ... + a<sub>nm</sub>x<sup>nm</sup></p>

<p>어떤 수 k(0 &le; k &le; n &times;&nbsp;m)가 주어졌을 때 x<sup>k</sup>의 계수 a<sub>k</sub>를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 음이 아닌 정수 n(0 &le; n &le; 500), m(1&nbsp;&le; m &le; 500), k가 주어진다.</p>

### 출력

<p>첫 번째 줄에 x<sup>k</sup>의 계수를 출력한다. 단, 수가 커질 수 있으므로 1,000,000,009로 나눈 나머지를 출력한다.</p>

### 힌트

<p>문제에 주어진 다항식을 푸는 방식 중 하나는 다음과 같다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16725.%E2%80%85%EB%8B%A4%ED%95%AD%E2%80%85%EA%B3%84%EC%88%98/07b1af61.png" data-original-src="https://upload.acmicpc.net/13decd85-0341-4980-b2c4-dc793fcd084f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<ol>
	<li>1+ x + x<sup>2</sup>의 계수를 표현</li>
	<li>x(1+ x + x<sup>2</sup>)의 계수를 표현</li>
	<li>x<sup>2</sup>(1+ x + x<sup>2</sup>)의 계수를 표현</li>
	<li>1~3의 각 열을 더함 &equiv; (1 + x + x<sup>2</sup>)<sup>2</sup>의 계수</li>
	<li value="7">4~6의 각 열을 더함&nbsp;&equiv; (1 + x + x<sup>2</sup>)<sup>3</sup>의 계수</li>
</ol>