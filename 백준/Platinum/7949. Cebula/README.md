# [Platinum III] Cebula - 7949

[문제 링크](https://www.acmicpc.net/problem/7949)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 114, 정답: 26, 맞힌 사람: 16, 정답 비율: 22.857%

### 분류

볼록 껍질, 기하학

### 문제 설명

<p>Cebula &ndash; dwuletnia roślina z rodziny amarylkowatych, jedna z najstarszych roślin warzywnych uprawianych przez człowieka &ndash; znana jest od ponad 5000 lat. Ojczyzną cebuli jest prawdopodobnie Azja Środkowa (tereny Indii, Afganistanu, Uzbekistanu, Iranu), skąd przeniosła się do Chin oraz państw w rejonie Bliskiego Wschodu oraz wok&oacute;ł basenu Morza Śr&oacute;dziemnego. Do Europy trafiła za pośrednictwem legion&oacute;w rzymskich.</p>

<p>Częścią jadalną rośliny jest podziemna cebula, pokryta łuską, a także część nadziemna, czyli wyrastający z niej szczypior &ndash; rurkowate, puste, zielone liście i ukryty wśr&oacute;d nich pęd.</p>

<p>Informatycy też mają swoją cebulę, kt&oacute;rą można obliczyć mając dany zbi&oacute;r punkt&oacute;w na płaszczyźnie. Cebula składa się z warstw. Warstwę cebuli tworzą punkty będące wierzchołkami wielokąta wypukłego wraz z punktami leżącymi na brzegu tego wielokąta. Cebulę można obrać z takiej warstwy, jeśli na zewnątrz niej nie ma w momencie obierania żadnych punkt&oacute;w. Oblicz minimalną liczbę ruch&oacute;w, w kt&oacute;rych można rozebrać cebulę na warstwy.</p>

### 입력

<p>Pierwsza linia wejścia zawiera małą liczbę całkowitą z &ndash; liczbę zestaw&oacute;w danych występujących kolejno po sobie. Opis jednego zestawu jest następujący:</p>

<p>W pierwszej linii występuje jedna liczba całkowita n oznaczająca liczbę punkt&oacute;w (0 &le; n &le; 5000). W kolejnych n liniach podane są wsp&oacute;łrzędne punkt&oacute;w. Każda linia zawiera dwie liczby całkowite x i y (&minus;10<sup>9</sup> &le; x, y &le; 10<sup>9</sup>) odpowiadające wsp&oacute;łrzędnej x-owej i y-owej punktu. Punkty są parami r&oacute;żne.</p>

### 출력

<p>Dla każdego zestawu danych wypisz jedną linię zawierającą liczbę warstw cebuli obliczonej dla podanego zbioru punkt&oacute;w.</p>