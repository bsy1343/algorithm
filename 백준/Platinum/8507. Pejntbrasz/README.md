# [Platinum I] Pejntbrasz - 8507

[문제 링크](https://www.acmicpc.net/problem/8507)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 9, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Karolek dostał na gwiazdkę komputer. Niestety nie doprecyzował w liście do Świętego Mikołaja, że do komputera przydałoby się dorzucić trochę gier, i w rezultacie musiał zadowolić się Saperem i Pasjansem. Jednak niedawno odkrył jeszcze jeden program, kt&oacute;ry okazał się o wiele ciekawszy niż dwie wspomniane gry.</p>

<p>Pejntbrasz (bo o nim mowa) jest prostym programem do rysowania. Umożliwia tworzenie prostokątnych czarno-białych rysunk&oacute;w. Rysunek o wymiarach h x w składa się z h w kwadratowych pikseli. Karolkowi najbardziej spodobało się narzędzie do wypełniania kolorem. Zainspirowało go do wymyślenia nowej gry. Zasady są proste: mając dany czarno-biały rysunek, należy wykonując jak najmniej operacji wypełniania kolorem, spowodować by wszystkie piksele na obrazku miały ten sam kolor.</p>

<p>Karolek chciałby sprawdzić jak dobrze umie grać w swoją grę. Poprosił Cię o napisanie programu, kt&oacute;ry dla danego obrazka obliczy ile operacji potrzeba do zakończenia gry.</p>

<p>Bardzo szczeg&oacute;łowy opis działania narzędzia do wypełniania kolorem</p>

<p>Dwa piksele sąsiadują ze sobą, jeżeli mają wsp&oacute;lną krawędź. Dwa piksele p<sub>A</sub>, p<sub>B</sub> są połączone, jeśli istnieje ciąg p<sub>A</sub>=p<sub>0</sub>,p<sub>1</sub>,&hellip;,p<sub>k-1</sub>,p<sub>k</sub>=p<sub>B</sub> pikseli tego samego koloru, taki że dla każdego 0 &le; i &lt; k piksele p<sub>i</sub> oraz p<sub>i+1</sub> sąsiadują ze sobą. Obszarem nazwiemy maksymalny zbi&oacute;r pikseli połączonych. Aby użyć narzędzia do wypełniania koloru, zaznaczamy wybrany piksel na obrazku. W wyniku tej operacji wszystkie piksele z obszaru, do kt&oacute;rego należał wybrany piksel, zmienią kolor.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie dodatnie liczby całkowite h i w, oznaczające wysokość i szerokość obrazka. Liczba piksli w obrazku nie przeznacza 500. Kolejne h wierszy opisują obrazek. W każdym jest w znak&oacute;w (&#39;.&#39; oznacza biały piksel, natomiast &#39;X&#39; oznacza piksel czarny).</p>

<p>&nbsp;</p>

### 출력

<p>W jedynym wierszu wyjścia należy wypisać minimalną liczbę operacji potrzebnych do zakończenia gry Karolka.</p>