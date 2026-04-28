# [Silver III] Miasta - 8677

[문제 링크](https://www.acmicpc.net/problem/8677)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 34, 맞힌 사람: 28, 정답 비율: 82.353%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Wzdłuż rzeki znajduje się <em>n</em>&nbsp;miast. Pomiędzy każdą parą sąsiednich miast wybudowana jest droga, niestety nie zawsze dwukierunkowa, dlatego nie zawsze da się dojechać z każdego miasta do wszystkich innych. Znając, kt&oacute;re drogi są wybudowane, chcielibyśmy wiedzieć dla każdego miasta, do ilu innych miast da się z niego dojechać.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>), oznaczającą liczbę miast.</p>

<p>W kolejnym wierszu znajduje się <em>n</em> - 1&nbsp;liczb całkowitych <em>d</em><sub>1</sub>, <em>d</em><sub>2</sub>, ..., <em>d</em><sub><em>n</em>-1</sub>&nbsp;(0 &le; <em>d<sub>i</sub></em> &le; 2), gdzie&nbsp;<em>d<sub>i</sub></em>&nbsp;oznacza połączenie pomiędzy miastem <em>i</em>-tym, a <em>i</em>+1-wszym. Jeśli:</p>

<ul>
	<li><em>d<sub>i</sub></em> = 0, to z miasta <em>i</em>-tego biegnie jednokierunkowa droga do miasta <em>i</em>+1-wszego,</li>
	<li><em>d<sub>i</sub></em> = 1, to z miasta <em>i</em>+1-wszego biegnie jednokierunkowa droga do miasta&nbsp;<em>i</em>-tego,</li>
	<li><em>d<sub>i</sub></em> = 2, to miasta <em>i</em>-te i <em>i</em>+1-wsze połączone są drogą dwukierunkową.</li>
</ul>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia powinno znajdować się <em>n</em>&nbsp;liczb całkowitych <em>w</em><sub>1</sub>, <em>w</em><sub>2</sub>, ..., <em>w<sub>n</sub></em>, gdzie <em>w<sub>i</sub></em>&nbsp;oznacza liczbę miast, do kt&oacute;rych da się dojechać z miasta <em>i</em>-tego.</p>