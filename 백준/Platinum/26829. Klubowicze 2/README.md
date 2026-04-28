# [Platinum III] Klubowicze 2 - 26829

[문제 링크](https://www.acmicpc.net/problem/26829)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

구현, 누적 합, 두 포인터

### 문제 설명

<p>Zn&oacute;w odwiedzamy Bajtocki Klub Dyskusyjny<sup>&lowast;</sup>. Przypomnijmy, że posiada on 2<sup>n</sup> członk&oacute;w, z kt&oacute;rych każdy zadeklarował, jakie ma poglądy na n fundamentalnych pytań. Konkretne sformułowanie pytań nie jest istotne; wystarczy wiedzieć, że są to pytania, na kt&oacute;re można udzielić jednej z dw&oacute;ch odpowiedzi (np. &bdquo;kawa czy herbata?&rdquo;). Poglądy danej osoby możemy kodować za pomocą ciągu bit&oacute;w, kt&oacute;ry interpretowany w systemie binarnym da liczbę całkowitą z przedziału od 0 do 2<sup>n</sup> &minus;1. Ponadto w klubie nie ma dw&oacute;ch os&oacute;b o jednakowych poglądach.</p>

<p>Dzisiaj odbywa się kolejne spotkanie klubu, na kt&oacute;rym pojawiło się m klubowicz&oacute;w i każdy zajął już wybrane przez siebie miejsce przy tradycyjnym okrągłym stole. Nadszedł czas, aby om&oacute;wić Bardzo Ważny Temat, na kt&oacute;ry wszyscy czekali. Klubowicze chcieliby się dobrze przygotować do dyskusji, więc postanowili podzielić się na dwa zespoły i wstępnie om&oacute;wić temat w tych zespołach. Żeby nie robić zamieszania, każdy zesp&oacute;ł powinien składać się z klubowicz&oacute;w zajmujących kolejne miejsca przy stole. Ponadto ze względu na rzeczowość dyskusji chcemy, aby w każdym zespole był pełny przekr&oacute;j pogląd&oacute;w. Innymi słowy, dla każdego fundamentalnego pytania i możliwej na nie odpowiedzi, jeśli w pierwszym zespole istnieje osoba mająca taki pogląd, to w drugim zespole też musi istnieć taka osoba.</p>

<p>Napisz program, kt&oacute;ry obliczy, na ile sposob&oacute;w można dokonać podziału klubowicz&oacute;w na zespoły.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite n i m (n &ge; 2, m &ge; 3) oznaczające odpowiednio liczbę fundamentalnych pytań oraz liczbę klubowicz&oacute;w na spotkaniu. W drugim wierszu znajduje się ciąg m parami r&oacute;żnych liczb z przedziału od 0 do 2<sup>n</sup> &minus; 1, opisujący poglądy kolejnych os&oacute;b przy okrągłym stole.</p>

### 출력

<p>Na standardowe wyjście należy wypisać jedną liczbę całkowitą oznaczającą liczbę sposob&oacute;w podziału klubowicz&oacute;w na dwa zespoły spełniające warunki zadania.</p>

### 제한

<ul>
	<li>n &le; 30</li>
	<li>m &le; min(2<sup>n</sup>, 2 000 000)</li>
</ul>