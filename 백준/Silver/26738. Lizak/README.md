# [Silver I] Lizak - 26738

[문제 링크](https://www.acmicpc.net/problem/26738)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 31, 맞힌 사람: 26, 정답 비율: 78.788%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 두 포인터

### 문제 설명

<p>Bajtek udał się do cukierni. Jego uwagę przykuł długi lizak składający się z N części r&oacute;wnej długości. Każda część lizaka ma pewien określony smak.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1b227eaf-4f88-4478-9221-73af9a89711c/-/preview/" style="width: 379px; height: 26px;" /></p>

<p>Bajtek chciałby wybrać pewien sp&oacute;jny fragment tego lizaka. Aby to zrobić, może on odłamać pewną liczbę części (być może zero) z lewej i prawej strony tego lizaka. Poniższy rysunek pokazuje kilka możliwości wybrania fragment&oacute;w z lizaka przedstawionego powyżej. Przykładowe fragmenty oznaczone są czarną ramką.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3df885a2-b2e4-4fe1-80c5-e93f73888a49/-/preview/" style="width: 386px; height: 143px;" /></p>

<p>Bajtek uważa fragment lizaka za smaczny, jeżeli zawiera co najmniej trzy części o tym samym smaku. Zwr&oacute;ć uwagę, że Bajtka nie interesuje jaki dokładnie smak będzie występował trzy razy, ani ile będzie r&oacute;żnych smak&oacute;w w tym fragmencie. Zauważ, że wszystkie fragmenty z rysunku powyżej są smaczne.</p>

<p>Bajtek nie zamierza się przejadać. Chciałby więc wybrać najkr&oacute;tszy smaczny fragment lizaka, czyli taki fragment kt&oacute;ry składa się z jak najmniejszej liczby części. Pom&oacute;ż mu!</p>

<p>Napisz program, kt&oacute;ry na podstawie opisu lizaka wyznaczy długość jego najkr&oacute;tszego smacznego fragmentu lub stwierdzi że nie jest możliwe wybranie żadnego smacznego fragmentu.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 500 000) określająca liczbę części dostępnego lizaka w sklepie. W drugim (ostatnim) wierszu wejścia znajduje się opis części tego lizaka. Lizak ten reprezentowany jest jako ciąg N liczb naturalnych A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>9</sup>). Są to oznaczenia smak&oacute;w fragment&oacute;w lizaka w kolejności ich występowania w lizaku od lewej do prawej. R&oacute;żne smaki reprezentowane są r&oacute;żnymi liczbami.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia powinna się znaleźć jedna liczba całkowita &ndash; minimalna liczba części, kt&oacute;re ma smaczny fragment lizaka zgodnie z warunkami powyżej. Jeśli z lizaka opisanego na wejściu nie można wybrać smacznego fragmentu to zamiast tego należy wypisać tylko jedno słowo <code>NIE</code>.</p>