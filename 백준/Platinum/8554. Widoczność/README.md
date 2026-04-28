# [Platinum III] Widoczność - 8554

[문제 링크](https://www.acmicpc.net/problem/8554)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 2, 맞힌 사람: 2, 정답 비율: 33.333%

### 분류

수학, 자료 구조, 이분 탐색, 조합론, 스택

### 문제 설명

<p>Dany jest ciąg liczb całkowitych <em>x</em><sub>1</sub>, <em>x</em><sub>2</sub>, ..., <em>x<sub>n</sub></em>. Powiemy, że dwa elementy <em>x<sub>i</sub></em>&nbsp;i&nbsp;<em>x<sub>j</sub></em>&nbsp;(dla 1 &le; <em>i</em> &lt; <em>j</em> &le; <em>n</em>)&nbsp;<i>widzą się bezpośrednio</i>&nbsp;nawzajem, jeśli każdy z element&oacute;w <em>x</em><sub><em>i</em>+1</sub>, ..., <em>x</em><sub><em>j</em>-1</sub>&nbsp;jest mniejszy od min(<em>x<sub>i</sub></em>, <em>x<sub>j</sub></em>). W szczeg&oacute;lności każde dwa kolejne elementy w ciągu widzą się bezpośrednio nawzajem. Powiemy, że dwa elementy&nbsp;<em>x<sub>i</sub></em>&nbsp;i&nbsp;<em>x<sub>j</sub></em>&nbsp;(dla 1 &le; <em>i</em> &lt; <em>j</em> &le; <em>n</em>) widzą się&nbsp;<i>pośrednio nawzajem</i>, jeżeli:</p>

<ul>
	<li>widzą się bezpośrednio nawzajem, lub</li>
	<li>istnieje takie <em>k</em>, <em>i</em> &lt; <em>k</em> &lt; <em>j</em>, że <em>x<sub>i</sub></em>&nbsp;i&nbsp;<em>x<sub>k</sub></em>&nbsp;widzą się bezpośrednio nawzajem, oraz&nbsp;<em>x<sub>k</sub></em>&nbsp;i&nbsp;<em>x<sub>j</sub></em>&nbsp;widzą się bezpośrednio nawzajem.</li>
</ul>

<p>Zadanie polega na obliczeniu dla danego ciągu&nbsp;<em>x</em><sub>1</sub>, <em>x</em><sub>2</sub>, ..., <em>x<sub>n</sub></em>&nbsp;liczby wszystkich takich par (<em>i</em>, <em>j</em>), że 1 &le; <em>i</em> &lt; <em>j</em> &le; <em>n</em>&nbsp;oraz elementy <em>x<sub>i</sub></em>&nbsp;i&nbsp;<em>x<sub>j</sub></em>&nbsp;widzą się&nbsp;<i>pośrednio</i>&nbsp;nawzajem.</p>

### 입력

<p>W pierwszym wierszu zapisana jest jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 40 000). W kolejnych wierszach zapisane są kolejne elementy ciągu, po jednym w wierszu. Elementy ciągu to liczby całkowite z zakresu od -1 000 000&nbsp;do&nbsp;1 000 000.</p>

### 출력

<p>Program powinien wypisać jeden wiersz, zawierający jedną liczbę całkowitą - liczbę takich par (<em>i</em>, <em>j</em>), że 1 &le; <em>i</em> &lt; <em>j</em> &le; <em>n</em>&nbsp;oraz elementy <em>x<sub>i</sub></em>&nbsp;i&nbsp;<em>x<sub>j</sub></em>&nbsp;widzą się&nbsp;<i>pośrednio</i>&nbsp;nawzajem.</p>