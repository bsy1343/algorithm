# [Silver I] Optymalizacja mandatów - 26757

[문제 링크](https://www.acmicpc.net/problem/26757)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 26, 맞힌 사람: 22, 정답 비율: 78.571%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Chyba nikt nie lubi być łapany na przekroczeniu prędkości &ndash; co gorsza, w Bajtocji kary są bardzo surowe, a system ich przydzielania dość skomplikowany.</p>

<p>Każde takie wykroczenie rejestrowane jest jako para (K<sub>i</sub>, R<sub>i</sub>), gdzie liczba K<sub>i</sub> oznacza, o ile przekroczona została dopuszczalna prędkość, a R<sub>i</sub> &ndash; numer służbowy policjanta, kt&oacute;ry nałożył mandat. Kwota mandatu to sklejenie cyfr liczb K<sub>i</sub> oraz R<sub>i</sub>. Na przykład: jeśli K<sub>i</sub> = 12, a R<sub>i</sub> = 5 432, to kwota wynosi aż 125 432.</p>

<p>Bajtazar otrzymał właśnie N mandat&oacute;w do zapłacenia. Patrząc na łączną ich kwotę poprzysiągł sobie, że nigdy więcej nie dociśnie gazu w swoim Alfa Bitteo. Aby jednak m&oacute;c zachować sw&oacute;j samoch&oacute;d i przez najbliższy rok jeść cokolwiek poza keczupem, będzie musiał dokonać pewnej optymalizacji.</p>

<p>Płacone mandaty są kontrolowane przez dwa r&oacute;żne wydziały skarbowe &ndash; Wydział Ewidencji Prędkości sprawdza tylko, czy wśr&oacute;d zapłaconych mandat&oacute;w obecne są wszystkie wartości prędkości K<sub>i</sub>, a Wydział Ewidencji Policjant&oacute;w &ndash; czy zgadzają się numery służbowe R<sub>i</sub>. Nikt jednak sprawdza, w jakiej kolejności (i w jakich parach) mandaty zostały zapłacone. To oczywiście może wpływać na sumaryczną kwotę do zapłacenia &ndash; uczciwy, lecz sprytny pirat drogowy (taki jak Bajtazar) może &bdquo;posklejać&rdquo; ze sobą liczby K<sub>i</sub> oraz R<sub>i</sub> inaczej niż oryginalnie, tak aby łączna kwota była jak najmniejsza. Czy możesz mu pom&oacute;c?</p>

<p>Napisz program, kt&oacute;ry wczyta wartości przekroczeń prędkości K<sub>i</sub> oraz numery służbowe R<sub>i</sub>, obliczy najmniejszą możliwą sumaryczną kwotę mandat&oacute;w przy najlepszym przypisaniu jednych numer&oacute;w do drugich, i wypisze wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 1 000 000) określająca liczbę mandat&oacute;w Bajtazara. W drugim wierszu wejścia znajduje się ciąg N liczb naturalnych K<sub>i</sub> (1 &le; K<sub>i</sub> &le; 100 000): wartości przekroczeń prędkości. W trzecim (ostatnim) wierszu wejścia znajduje się ciąg N liczb naturalnych R<sub>i</sub> (1 &le; R<sub>i</sub> &le; 100 000): numery służbowe policjant&oacute;w, kt&oacute;rzy przyłapali Bajtazara na nieostrożnej jeździe.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia należy wypisać jedną liczbę naturalną &ndash; minimalna kwota do zapłacenia przy optymalnym przypisaniu wartości prędkości do numer&oacute;w służbowych zgodnie z zasadami opisanymi powyżej.</p>