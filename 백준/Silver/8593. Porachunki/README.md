# [Silver I] Porachunki - 8593

[문제 링크](https://www.acmicpc.net/problem/8593)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

구현, 그리디 알고리즘, 애드 혹, 누적 합

### 문제 설명

<p>Firma Bajtosoft zatrudnia $n$&nbsp;pracownik&oacute;w. Z powodu tajności projekt&oacute;w przez nią wykonywanych, nie wszyscy spośr&oacute;d nich się znają. Znają się ze sobą tylko ci, kt&oacute;rzy zajmują się kolejnymi fazami pracy nad projektami.</p>

<p>Każdy projekt jest opracowywany w spos&oacute;b sekwencyjny: najpierw pracownik nr $1$&nbsp;(szef zespołu) tworzy pierwszy szkic projektu, następnie przekazuje go pracownikowi nr $2$; ten po wykonaniu swojego zadania efekt pracy przekazuje pracownikowi nr $3$, i tak dalej, aż w końcu projekt trafia do pracownika nr $n$, kt&oacute;ry kończy pracę nad nim i przekazuje gotowy produkt szefowi (pracownikowi nr $1$).</p>

<p>Każdy pracownik ma w umowie zapisaną wysokość pensji, kt&oacute;ra mu przysługuje. Jednak firma nie zawsze dobrze wywiązuje się z umowy i choć zawsze wypłaca w sumie tyle pieniędzy swoim pracownikom, ile im się łącznie należy, to jednak nie zawsze wypłaca pieniądze właściwym osobom. Często zdarza się tak, że pewna osoba dostaje mniej pieniędzy, niż ma to zagwarantowane w umowie, zaś inna dostaje więcej, niż powinna.</p>

<p>Na szczęście pracownicy są uczciwi, dlatego um&oacute;wili się, że po każdej wypłacie będą między sobą regulować wysokość otrzymanej pensji, tak aby ostatecznie każdy otrzymał dokładnie tyle, ile ma zagwarantowane w umowie.</p>

<p>Mają tylko jeden problem: przekazywać między sobą pieniądze mogą tylko ci pracownicy, kt&oacute;rzy się znają, tzn. dla każdego $1 &lt; i &lt; n$&nbsp;pracownik nr $i$&nbsp;może przekazać lub otrzymać pieniądze jedynie od pracownik&oacute;w nr $i-1$&nbsp;oraz $i+1$, pracownik nr $1$&nbsp;może dokonywać transakcji z pracownikami nr $2$&nbsp;oraz nr $n$, zaś pracownik nr $n$&nbsp;może dokonywać transakcji z pracownikami nr $n-1$&nbsp;oraz nr $1$.</p>

<p>Ponieważ każde takie wyr&oacute;wnywanie płac wymaga wielu transakcji, pracownicy Bajtosoftu poprosili Ciebie, niezależnego programistę, o napisanie programu, kt&oacute;ry po każdej wypłacie wyznaczy minimalną liczbę transakcji potrzebnych do wyr&oacute;wnania rachunk&oacute;w.</p>

<p>Zakładamy tutaj, że pracownicy wykorzystują w transakcjach tylko te sumy pieniędzy, kt&oacute;re otrzymali w ramach danej wypłaty od firmy, oraz te, kt&oacute;re otrzymali od innych pracownik&oacute;w w poprzednich transakcjach.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita $n$&nbsp;($1 &le; n &le; 1\,000\,000$) oznaczająca liczbę pracownik&oacute;w Bajtosoftu.</p>

<p>W każdym z następnych $n$&nbsp;wierszy znajdują się dwie liczby całkowite $a_i$&nbsp;oraz $b_i$&nbsp;($1 &le; a_i, b_i &le; 1\,000$), oddzielone pojedynczym odstępem i oznaczające pensję $i$-tego pracownika zagwarantowaną w umowie oraz ilość pieniędzy, kt&oacute;rą otrzymał w rzeczywistości (wyrażone w bajtalarach). Możesz założyć, że $a_1 + a_2 + \dots + a_n = b_1 + b_2 + \dots + b_n$.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać w pierwszym i jedynym wierszu standardowego wyjścia jedną liczbę całkowitą oznaczającą minimalną liczbę transakcji pomiędzy znającymi się pracownikami, kt&oacute;ra doprowadzi do stanu, w kt&oacute;rym każdy pracownik otrzyma ostatecznie (po uwzględnieniu wszystkich transakcji) tyle pieniędzy, ile ma zagwarantowane w umowie.</p>

<p>W przypadku gdy żaden zestaw transakcji nie doprowadzi do takiego stanu, należy wypisać jedno słowo &quot;<code>NIE</code>&quot;.</p>

### 힌트

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;Wyr&oacute;wnanie wszystkich pensji następuje w dw&oacute;ch krokach: pracownik nr 3 przekazuje pracownikowi nr 2 jednego bajtalara, a pracownik nr 1 przekazuje pracownikowi nr 4 trzy bajtalary.</p>