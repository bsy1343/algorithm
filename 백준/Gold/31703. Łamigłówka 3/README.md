# [Gold II] Łamigłówka 3 - 31703

[문제 링크](https://www.acmicpc.net/problem/31703)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 6, 맞힌 사람: 6, 정답 비율: 30.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bajtek uwielbia grać w gry mobilne. Irytują go jednak często pojawiające się reklamy innych gier, w kt&oacute;rych osoba grająca radzi sobie bardzo źle, co ma wywołać frustrację osoby oglądającej i chęć zagrania. Jedna z takich reklam (kt&oacute;rą być może mieliście okazję sami zobaczyć) szczeg&oacute;lnie zapadła Bajtkowi w pamięć.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31703.%E2%80%85%C5%81amig%C5%82%C3%B3wka%E2%80%853/965d7467.png" data-original-src="https://upload.acmicpc.net/80c0a57a-d6c3-4fc3-94cf-07b071daca9b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 729px; height: 600px;" /></p>

<p>Jako że inspirację można czerpać ze wszystkiego, Bajtek postanowił na podstawie powyższej gry stworzyć zadanie. Wybierze on sobie docelową kolorową planszę o wymiarach n&times;m, a grę rozpocznie z planszą n&times;m, na kt&oacute;rej żadne pole nie ma koloru. W jednym ruchu może on wybrać rząd lub kolumnę i przemalować wszystkie pola w nim/niej wybranym przez siebie kolorem (zwr&oacute;ć uwagę na to, że daje mu to większą swobodę niż w grze przedstawionej na obrazkach powyżej, gdzie wiersze i kolumny miały narzucone kolory). Aby nieco sformalizować zadanie, wszystkie kolory oznaczył wielkimi literami alfabetu angielskiego. Czy pomożesz mu i napiszesz program, kt&oacute;ry dla każdej zadanej przez niego planszy poda ciąg ruch&oacute;w, kt&oacute;ry poprawnie stworzy docelowy układ kolor&oacute;w? Możesz założyć, że dostaniesz dane wejściowe, w kt&oacute;rych ten cel można osiągnąć w co najwyżej n + m ruchach.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite n i m (1 &le; n, m &le; 2 000), oznaczające odpowiednio wysokość i szerokość planszy.</p>

<p>W każdym z kolejnych n wierszy znajduje się po m znak&oacute;w, z kt&oacute;rych każdy jest wielką literą alfabetu angielskiego; j-ty znak w i-tym z tych wierszy oznacza docelowy kolor pola znajdującego się w i-tym rzędzie i j-tej kolumnie planszy.</p>

<p>Gwarantowanym jest, że zadany układ kolor&oacute;w można osiągnąć ciągiem co najwyżej n+m ruch&oacute;w opisanych w treści zadania.</p>

### 출력

<p>W pierwszym wierszu wyjścia powinna znaleźć się jedna liczba całkowita r (1 &le; r &le; n+m), oznaczająca liczbę ruch&oacute;w, kt&oacute;re chcesz zrobić. W każdym z następnych r wierszy powinien znaleźć się opis ruchu.</p>

<p>Opis jednego ruchu powinien zaczynać się od znaku &lsquo;R&rsquo; lub &lsquo;K&rsquo;, oznaczającego, czy chcesz przemalować rząd, czy kolumnę (gdzie oczywiście &lsquo;R&rsquo; oznacza rząd, a &lsquo;K&rsquo; kolumnę). Dalej, po pojedynczej spacji, powinien znajdować się numer rzędu lub kolumny, kt&oacute;rą chcesz przemalować. Rzędy numerujemy od g&oacute;ry do dołu liczbami od 1 do n, kolumny zaś od lewej do prawej liczbami od 1 do m. Następnie, po pojedynczej spacji, powinna znajdować się jedna wielka litera alfabetu angielskiego, oznaczająca kolor, na jaki chcesz przemalować wybrany rząd lub kolumnę.</p>

<p>Zwr&oacute;ć uwagę na to, że nie musisz minimalizować liczby ruch&oacute;w &ndash; wystarczy, że wykonasz ich co najwyżej n + m.</p>

### 힌트

<p>Wyjaśnienie przykładu: Jeśli w pierwszym teście przykładowym założymy, że litera &lsquo;P&rsquo; oznacza kolor zielony, litera &lsquo;A&rsquo; oznacza kolor ż&oacute;łty, zaś litera &lsquo;Z&rsquo; oznacza kolor niebieski, to wybrany ciąg ruch&oacute;w maluje planszę w następujący spos&oacute;b:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31703.%E2%80%85%C5%81amig%C5%82%C3%B3wka%E2%80%853/dcb2be81.png" data-original-src="https://upload.acmicpc.net/0ccba224-a4f4-43bd-bdb8-a1a675f6dd94/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 713px; height: 200px;" /></p>