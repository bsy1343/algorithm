# [Gold IV] Mecze - 8247

[문제 링크](https://www.acmicpc.net/problem/8247)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 29, 맞힌 사람: 21, 정답 비율: 47.727%

### 분류

자료 구조, 정렬, 집합과 맵, 비트마스킹

### 문제 설명

<p>W sobotnie przedpołudnie na boisku Klubu Sportowego &quot;Bajtusie&quot; zbierze się <em>n</em>&nbsp;chłopc&oacute;w. Szczęśliwie się złożyło, że liczba chłopc&oacute;w jest parzysta. Dzięki temu wszyscy chłopcy będą mogli radośnie spędzić ten sobotni dzień, grając w piłkę.</p>

<p>Bajtazar jest trenerem klubu i to on jest odpowiedzialny za dob&oacute;r skład&oacute;w na poszczeg&oacute;lne mecze. Bajtazar wie, że chłopcy bardzo lubią wsp&oacute;łzawodniczyć, dlatego też postanowił w taki spos&oacute;b ułożyć składy drużyn, aby każdych dw&oacute;ch chłopc&oacute;w miało szansę zagrać przeciwko sobie w jakimś meczu (tzn. choć raz zagrać w przeciwnych drużynach).</p>

<p>Biorąc pod uwagę umiejętności chłopc&oacute;w, Bajtazar zaproponował już składy drużyn na najbliższe <em>m</em>&nbsp;mecz&oacute;w. W każdym meczu zagrają wszyscy chłopcy, podzieleni na dwie drużyny po <em>n</em> / 2&nbsp;zawodnik&oacute;w. Pom&oacute;ż Bajtazarowi stwierdzić, czy każda para chłopc&oacute;w zagra przeciwko sobie choć w jednym z zaplanowanych mecz&oacute;w.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite <em>n</em>&nbsp;oraz <em>m</em>&nbsp;(4 &le; <em>n</em> &le; 40 000, 1 &le; <em>m</em> &le; 50) oznaczające liczbę chłopc&oacute;w oraz liczbę zaplanowanych mecz&oacute;w. Każdy chłopiec ma na koszulce napisany numer - liczbę całkowitą między 1&nbsp;a <em>n</em>. Numery na koszulkach poszczeg&oacute;lnych chłopc&oacute;w są parami r&oacute;żne.</p>

<p>Każdy z kolejnych <em>m</em>&nbsp;wierszy zawiera po <em>n</em>&nbsp;parami r&oacute;żnych liczb całkowitych z zakresu od 1&nbsp;do <em>n</em>&nbsp;opisujących składy drużyn na poszczeg&oacute;lne mecze. Pierwsze <em>n</em> / 2&nbsp;liczb w każdym wierszu to numery zawodnik&oacute;w grających w pierwszej drużynie, a drugie <em>n</em> / 2&nbsp;liczb - numery zawodnik&oacute;w wchodzących w skład drugiej drużyny.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście jedno słowo&nbsp;<code>TAK</code>&nbsp;lub&nbsp;<code>NIE</code>, w zależności od tego, czy każda para chłopc&oacute;w zagra przeciwko sobie co najmniej w jednym meczu, czy też nie.</p>