# [Gold II] Genomy - 8502

[문제 링크](https://www.acmicpc.net/problem/8502)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

방향 비순환 그래프, 다이나믹 프로그래밍, 그래프 이론, 위상 정렬

### 문제 설명

<p>Biolodzy zajmujący się genetyką por&oacute;wnawczą poszukują sekwencji gen&oacute;w zachowanych w pewnym zbiorze gatunk&oacute;w.</p>

<p>Niech zbi&oacute;r liczb {1,2,&hellip;,n} oznacza geny - każdej liczbie odpowiada jeden gen. Każdy z gatunk&oacute;w określony jest permutacją liczb (1,2,&hellip;,n}, kt&oacute;ra oznacza uporządkowanie jego gen&oacute;w. Ciąg gen&oacute;w x<sub>1</sub>,x<sub>2</sub>,&hellip;,x<sub>k</sub> jest zachowaną sekwencją gen&oacute;w w zbiorze gatunk&oacute;w, jeśli jest on podciągiem (niekoniecznie sp&oacute;jnym) uporządkowania gen&oacute;w każdego z tych gatunk&oacute;w.</p>

<p>Zadanie</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis sekwencji gen&oacute;w,</li>
	<li>wyznaczy długość najdłuższej zachowanej sekwencji,</li>
	<li>zapisze odpowiedź na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszej linii standardowego wejścia znajdują się dwie liczby całkowite n i m oddzielone pojedynczym odstępem, przy czym 1 &le; n &le; 500 oraz 1 &le; m &le; 20. Liczba n oznacza liczbę gen&oacute;w, a m liczbę gatunk&oacute;w. Każda z następnych m linii zawiera genom kolejnego gatunku zapisany jako permutacja liczb 1,2,&hellip;,n pooddzielanych pojedynczymi odstępami.</p>

### 출력

<p>Na wyjściu powinna zostać wypisana dokładnie jedna liczba całkowita r&oacute;wna długości najdłuższej zachowanej sekwencji gen&oacute;w.</p>