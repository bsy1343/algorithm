# [Platinum III] Elektrownie i fabryki - 26677

[문제 링크](https://www.acmicpc.net/problem/26677)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 18, 정답: 16, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

자료 구조, 다이나믹 프로그래밍, 가장 긴 증가하는 부분 수열 문제, 누적 합, 세그먼트 트리

### 문제 설명

<p>Aby przeciwdziałać rosnącemu bezrobociu, rząd Bajtocji postanowił stworzyć nowe miejsca pracy. W tym celu wybudowane zostaną nowoczesne fabryki, a także nowe elektrownie, kt&oacute;re będą zasilały fabryki w energię elektryczną.</p>

<p>Bajtocję przecina długa autostrada, przy kt&oacute;rej zlokalizowane jest n miast. Miasta dla uproszczenia będziemy numerować od 1 do n. Każde kolejne miasto jest oddalone od poprzedniego o jeden kilobajtometr.</p>

<p>Odpowiednie decyzje już zapadły i w niekt&oacute;rych miastach powstaną fabryki, a w niekt&oacute;rych elektrownie. Dla i-tego miasta znamy wartość a<sub>i</sub>. Jeśli jest ona dodatnia, to w i-tym mieście powstanie elektrownia o mocy elektrycznej a<sub>i</sub> megawat&oacute;w, a jeśli jest ujemna, to w tym mieście powstanie fabryka konsumująca &minus;a<sub>i</sub> megawat&oacute;w. Jeśli a<sub>i</sub> = 0, to w mieście nie planuje się budowy.</p>

<p>Twoim zadaniem jest zaprojektowanie sieci energetycznej, kt&oacute;ra pozwoli dostarczyć prąd z elektrowni do fabryk. Dla każdej pary sąsiednich miast należy zdecydować, czy między nimi powstanie odcinek sieci. Prąd może popłynąć z elektrowni do fabryki, jeśli miasta, w kt&oacute;rych znajdują się te budynki, są bezpośrednio lub pośrednio połączone odcinkami sieci. Sieć jest poprawnie zaprojektowana, jeśli zapotrzebowanie na prąd dla każdej fabryki zostanie zaspokojone. Koszt sieci jest wprost proporcjonalny do sumarycznej długości odcink&oacute;w sieci (w kilobajtometrach).</p>

<p>Napisz program, kt&oacute;ry zaprojektuje najtańszą poprawną sieć energetyczną.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się liczba całkowita n (1 &le; n &le; 500 000), oznaczająca liczbę miast w Bajtocji.</p>

<p>W drugim wierszu znajduje się ciąg n liczb całkowitych a<sub>1</sub>, . . . , a<sub>n</sub> (&minus;10<sup>9</sup> &le; a<sub>i</sub> &le; 10<sup>9</sup>) oznaczających produkcję lub konsumpcję energii w budynkach dla kolejnych miast.</p>

### 출력

<p>Na wyjściu należy wypisać jeden wiersz zawierający minimalny koszt poprawnej sieci energetycznej. Jeśli nie istnieje żadna poprawna sieć energetyczna, należy wypisać &minus;1.</p>

### 힌트

<p>Wyjaśnienie przykładu: Poniżej zilustrowano test przykładowy zawierający n = 17 miast, w kt&oacute;rych zostaną wybudowane trzy fabryki (białe k&oacute;łka) i cztery elektrownie (czarne k&oacute;łka). Zaznaczono także poprawną sieć energetyczną o długości 12 kilobajtometr&oacute;w (szare odcinki).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26677.%E2%80%85Elektrownie%E2%80%85i%E2%80%85fabryki/732b6cd9.png" data-original-src="https://upload.acmicpc.net/fa69de70-0bc3-4b8f-9408-b98c86918d60/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 349px; height: 46px;" /></p>