# [Platinum II] Świetliki - 10016

[문제 링크](https://www.acmicpc.net/problem/10016)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

삼분 탐색

### 문제 설명

<p>Z samego rana Bajtazar rozsiadł się wygodnie na pomoście przy Jeziorze Bajtockim i oddał się swojemu ulubionemu hobby, czyli wędkowaniu. W pewnym momencie zauważył, że nad spokojną taflą jeziora unosi się wciąż wiele świetlik&oacute;w. Widok ten spodobał się Bajtazarowi na tyle, że postanowił uwiecznić go na zdjęciu.</p>

<p>Zdjęcia robione aparatem Bajtazara mają kształt kwadratu. Przed wykonaniem zdjęcia Bajtazar może ustawić aparat na dowolnej wysokości i przesunąć go w lewo lub w prawo. Nie chce go jednak obracać, żeby zdjęcie nie wyszło krzywe. Aparat jest też wyposażony w funkcję&nbsp;<i>zoom</i>, służącą do przybliżania bądź oddalania obrazu.</p>

<p>Bajtazar koniecznie chce, żeby wszystkie świetliki fruwające nad taflą jeziora znalazły się na zdjęciu. Za pomocą funkcji&nbsp;<i>zoom</i>&nbsp;chciałby ustawić parametry zdjęcia tak, żeby owady miały na nim jak największe rozmiary. Bajtazar jest skłonny trochę poczekać, aż ustawią się idealnie do zdjęcia.</p>

<p>Aby trochę uprościć sytuację, możemy założyć, że wszystkie świetliki znajdują się cały czas w tej samej płaszczyźnie, r&oacute;wnoległej do płaszczyzny matrycy aparatu, oraz że każdy z nich porusza się ze stałym wektorem prędkości.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 100 000), oznaczającą liczbę świetlik&oacute;w. Każdy z kolejnych <em>n</em>&nbsp;wierszy zawiera cztery liczby całkowite <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>, <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>&nbsp;(-10<sup>6</sup> &le; <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>, <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em> &le; 10<sup>6</sup>) oznaczające początkowe położenie (<em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>)&nbsp;i wektor prędkości [<em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>]&nbsp;<em>i</em>-tego owada. Innymi słowy, po <em>t</em>&nbsp;jednostkach czasu <em>i</em>-ty świetlik znajdzie się w punkcie (<em>x<sub>i</sub></em> + <em>t</em>&nbsp;&middot;&nbsp;<em>a<sub>i</sub></em>, <em>y<sub>i</sub></em> + <em>t</em>&nbsp;&middot;&nbsp;<em>b<sub>i</sub></em>). Wsp&oacute;łrzędne punkt&oacute;w podane są w prostokątnym układzie wsp&oacute;łrzędnych, kt&oacute;rego osie są r&oacute;wnoległe do bok&oacute;w matrycy aparatu.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać jeden wiersz zawierający nieujemną liczbę rzeczywistą <em>d</em>&nbsp;- minimalny bok kwadratu, kt&oacute;rym można pokryć wszystkie świetliki w pewnym momencie czasu, przy czym boki kwadratu muszą być r&oacute;wnoległe do osi układu wsp&oacute;łrzędnych. Wynik może r&oacute;żnić się od dokładnego o co najwyżej 10<sup>-3</sup>.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10016.%E2%80%85%C5%9Awietliki/2a742e43.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10016.%E2%80%85%C5%9Awietliki/2a742e43.png" data-original-src="https://upload.acmicpc.net/41c04d95-3551-4df1-88f1-d5312421de93/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 318px; height: 315px;" /></p>

<p>Na rysunku zaznaczono początkowe pozycje świetlik&oacute;w oraz przebytą przez nie drogę w ciągu dw&oacute;ch jednostek czasu. Zaznaczono też kwadrat o boku 3, kt&oacute;ry zawiera wszystkie świetliki w chwili <em>t</em> = 2.</p>