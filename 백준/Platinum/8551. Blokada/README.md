# [Platinum II] Blokada - 8551

[문제 링크](https://www.acmicpc.net/problem/8551)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 180, 정답: 112, 맞힌 사람: 94, 정답 비율: 59.494%

### 분류

그래프 이론, 최대 유량, 최대 유량 최소 컷 정리

### 문제 설명

<p>Już w zeszłym roku UOB (Urząd Ochrony Bajtocji) dowiedział się o planowanym zamachu na bajtockie łącza internetowe. Długie śledztwo wykazało, że za tym zamachem stoi jedna osoba. M&oacute;zgiem całej operacji jest prawdopodobnie pewien informatyk ukrywjący się pod pseudonimem &quot;S**&quot; (nie możemy go całkowicie ujawnić ze względu na dobro śledztwa). Jednakże od kilku miesięcy nie mozna go znaleźć mimo poszukiwań na wielką skalę. Ze zdobytych podczas śledztwa informacji wynika, że celem ataku będzie uniemożliwienie wysyłania komunikat&oacute;w z serwera 1&nbsp;do serwera <em>n</em>. Wiadomo, że Bajtocki Internet niewiele r&oacute;żni się od tego jaki znamy. Składa się on z serwer&oacute;w i łączy internetowych pomiędzy nimi. Jednakże bajtockie łącza są jednokierunkowe. Przebiegły informatyk &quot;S**&quot; pozakładał pułapki na łączach. Po aktywacji pułapka przerywa łącze, na kt&oacute;rym została założona. Wiadomo, że &quot;S**&quot; zlecił założenie możliwie najmniejszej liczby pułapek, ale w spos&oacute;b uniemożliwiający komunikację od serwera 1&nbsp;do serwera&nbsp;<em>n</em>. UOB zwraca się do Ciebie (jako najlepszego programisty :-)) z prośbą o pomoc. Chciałby wiedzieć ile pułapek polecił założyć &quot;S**&quot; (jak je znaleźć to już inna historia).</p>

### 입력

<p>Na wejściu znajdują się informacje na temat bajtockiej sieci internetowej. W pierwszej lini są podane liczby <em>n</em>&nbsp;i <em>m</em>, 2 &le; n &le; 10 000, oznaczające odpowiednio liczbę serwer&oacute;w i łączy. Serwery ponumerowane są od 1 do <em>n</em>. W następnych <em>m</em>&nbsp;wierszach znajdują się opisy łączy. Opis każdego łącza składa się z liczb <em>a</em>&nbsp;i <em>b</em>, 1 &le; <em>a</em>, <em>b</em> &le; <em>n</em>, <em>a</em> &ne; <em>b</em>. Oznaczają one, że istnieje łącze od serwera <em>a</em>&nbsp;do serwera <em>b</em>. Wiadomo, że pomiędzy dwoma dowolnymi serwerami może istnieć tylko jedno bezpośrednie łącze.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba - minimalna liczba pułapek, kt&oacute;re polecił zastawić &quot;S**&quot;, żeby przerwać połączenie pomiędzy serwerami 1 i <em>n</em>.</p>