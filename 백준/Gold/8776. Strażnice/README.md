# [Gold V] Strażnice - 8776

[문제 링크](https://www.acmicpc.net/problem/8776)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Przenieśmy się do czas&oacute;w, w kt&oacute;rych najlepszym środkiem transportu był wierzchowiec, nad miastami g&oacute;rowały zamki, księżniczki były piękne a rycerze waleczni. W tych właśnie czasach żył nasz nowy bohater - Kapitan Lucjusz.</p>

<p>Kapitan Lucjusz zarządza strażnicami, kt&oacute;re zapewniają bezpieczeństwo jednemu z kr&oacute;lewskich miast. Strażnic jest&nbsp;<strong>N</strong>&nbsp;i są rozmieszczone na planie okręgu, tj. pierwsza strażnica sąsiaduje z drugą i z&nbsp;<strong>N</strong>-tą, druga z pierwszą i trzecią, etc.</p>

<p>W czasach Kapitana Lucjusza nie istniały jeszcze ministerstwa, ale istniała już biurokracja. Kapitan Lucjusz w każdej chwili spodziewa się odwiedzin kr&oacute;lewskich kontroler&oacute;w do spraw przestrzegania norm i regulamin&oacute;w. Urzędnicy będą chcieli skontrolować część strażnic zarządzanych przez Kapitana Lucjusza. Kapitan będzie m&oacute;gł wybrać dowolny sp&oacute;jny fragment swojej sieci strażnic (to jest taki, kt&oacute;ry zawiera kolejno sąsiadujące ze sobą strażnice), kt&oacute;ry będzie podlegał kontroli.</p>

<p>Kapitan Lucjusz przyporządkował każdej strażnicy liczbę całkowitą (ujemną, r&oacute;wną zero lub dodatnią) opisującą wrażenie, jakie według niego zrobi na kontrolerach wizyta w danej strażnicy. Ocena z całej kontroli będzie sumą wrażeń, jakie kontrolerzy odniosą w odwiedzanych strażnicach. Oblicz maksymalną ocenę, na jaką może liczyć Kapitan Lucjusz.</p>

<p>Fragment wybrany do kontroli przez Kapitana Lucjusza musi zawierać przynajmniej jedną strażnicę i w skrajnym przypadku może zawierać wszystkie strażnice.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>Pierwsza linia opisu zestawu testowego zawiera liczbę naturalną&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000000), oznaczającą liczbę strażnic pod zarządem Kapitana Lucjusza.</p>

<p>W drugiej linii opisu zestawu znajduje się&nbsp;<strong>N</strong>&nbsp;oddzielonych spacjami liczb całkowitych&nbsp;<strong>w<sub>i</sub></strong>&nbsp;( -1000 &lt;=&nbsp;<strong>w</strong><strong><sub>i</sub>&nbsp;</strong>&lt;= 1000)&nbsp;oznaczających oczekiwane wrażenie, jakie na kontrolerach zrobią poszczeg&oacute;lne strażnice.</p>

### 출력

<p>Dla każdego testu należy w osobnej linii wypisać maksymalną osiągalną ocenę z kontroli.</p>