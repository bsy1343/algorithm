# [Silver IV] Wielomian - 8419

[문제 링크](https://www.acmicpc.net/problem/8419)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 140, 정답: 29, 맞힌 사람: 18, 정답 비율: 15.517%

### 분류

임의 정밀도 / 큰 수 연산, 사칙연산, 수학

### 문제 설명

<p>Dla danego wielomianu <em>W</em>&nbsp;oraz zadanej liczby <em>x</em>, wyznacz trzy ostatnie cyfry (cyfrę setek, dziesiątek i jedności) wartości wyrażenia <em>W</em>(<em>x</em>).</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta opis wielomianu <em>W</em>&nbsp;oraz liczbę <em>x</em>,</li>
	<li>wyznaczy trzy ostatnie cyfry wartości wyrażenia <em>W</em>(<em>x</em>),</li>
	<li>wypisze wynik.</li>
</ul>

### 입력

<p>Pierwszy wiersz zawiera dwie liczby całkowite <em>s</em>&nbsp;(1 &le; <em>s</em> &le; 20,000) oraz <em>x</em>&nbsp;(-1,000,000 &le; <em>x</em> &le; 1,000,000). Drugi wiersz zawiera <em>s</em>&nbsp;liczb całkowitych <em>w</em><sub>1</sub>,&nbsp;<em>w</em><sub>2</sub>, ...,&nbsp;<em>w<sub>s</sub></em>&nbsp;(-1,000,000 &le; <em>w<sub>k</sub></em> &le; 1,000,000), pooddzielanych pojedynczymi odstępami. Liczby te, to kolejne wsp&oacute;łczynniki wielomianu: <em>W</em>(<em>x</em>) = <em>w</em><sub>1</sub><em>x</em><sup><em>s</em>-1</sup> + <em>w</em><sub>2</sub><em>x</em><sup><em>s</em>-2</sup> + .. + <em>w</em><sub><em>s</em>-1</sub><em>x</em> + <em>w<sub>s</sub></em>.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać słowo zbudowane z trzech ostatnich cyfr liczby r&oacute;wnej wartości wyrażenia <em>W</em>(<em>x</em>), w kolejności od cyfry setek do cyfry jedności.</p>