# [Gold I] Warsztaty - 8601

[문제 링크](https://www.acmicpc.net/problem/8601)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 17, 맞힌 사람: 12, 정답 비율: 28.571%

### 분류

구현, 자료 구조, 시뮬레이션

### 문제 설명

<p>W Bajtocji istnieje tylko jedna droga łącząca wsch&oacute;d z zachodem. Prowadzi ona przez dokładnie $m$&nbsp;miast. W każdym z nich znajduje się warsztat samochodowy umożliwiający przemalowanie samochodu. Każdy z warsztat&oacute;w ogłosił promocję, w ramach kt&oacute;rej darmowo przemalowuje samochody z koloru $a_j$&nbsp;na kolor $b_j$&nbsp;($j$&nbsp;to numer miasta wzdłuż drogi, $j = 1, 2, \dots , m$). Kolory te są wybierane niezależnie przez każdy warsztat. W każdym warsztacie obowiązuje dokładnie jedna taka promocja. Ze wschodu na zach&oacute;d wyruszyła wycieczka składająca się z $n$&nbsp;samochod&oacute;w. Kierowcy w Bajtocji są bardzo oszczędni, ale też lubią odświeżać swoje samochody. Z tego powodu każdy kierowca w każdym kolejnym mieście pr&oacute;buje przemalować sw&oacute;j samoch&oacute;d, ale robi to tylko wtedy, gdy jest to darmowe. Znając początkowe kolory wszystkich samochod&oacute;w, chcielibyśmy wyznaczyć kolory tych samochod&oacute;w po dotarciu na zach&oacute;d. Należy założyć, że droga jest jednokierunkowa, to znaczy samochody poruszają się tylko ze wschodu na zach&oacute;d.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się trzy liczby całkowite $n$, $m$&nbsp;oraz $k$&nbsp;($1 &le; n, m, k &le; 1\,000\,000$) pooddzielane pojedynczymi odstępami, oznaczające odpowiednio liczbę samochod&oacute;w, liczbę miast oraz liczbę możliwych kolor&oacute;w samochod&oacute;w. Kolory są ponumerowane od $1$&nbsp;do $k$. W drugim wierszu znajduje się $n$&nbsp;liczb całkowitych $k_i$&nbsp;($1 &le; k_i &le; k$) pooddzielanych pojedynczymi odstępami i oznaczających kolory kolejnych samochod&oacute;w. W następnych $m$&nbsp;wierszach znajdują się opisy kolejno odwiedzanych na trasie warsztat&oacute;w samochodowych. Każdy taki opis składa się z dw&oacute;ch liczb całkowitych $a_j$&nbsp;oraz $b_j$&nbsp;($1 &le; a_j, b_j &le; k$) oddzielonych pojedynczym odstępem, oznaczających, że warsztat w $j$-tym mieście przemalowuje darmowo samoch&oacute;d koloru $a_j$&nbsp;na kolor $b_j$.</p>

### 출력

<p>W pierwszym i jedynym wierszu standardowego wyjścia powinno znaleźć się $n$&nbsp;liczb całkowitych, pooddzielanych pojedynczymi odstępami i oznaczających kolory kolejnych samochod&oacute;w po dotarciu na zach&oacute;d.</p>

### 힌트

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;W pierwszym warsztacie przemalowane zostają samochody drugi i piąty, a zatem sekwencja kolor&oacute;w przyjmuje postać:&nbsp;<code>1 4 3 4 4</code>. W drugim warsztacie zmienia się jedynie kolor pierwszego samochodu - nowa sekwencja kolor&oacute;w to:&nbsp;<code>2 4 3 4 4</code>. Wreszcie w trzecim warsztacie przemalowane zostają samochody: drugi, czwarty i piąty. Ostateczna sekwencja kolor&oacute;w to:&nbsp;<code>2 1 3 1 1</code>.</p>