# [Gold II] Kinomani - 26812

[문제 링크](https://www.acmicpc.net/problem/26812)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 집합과 맵, 해시를 사용한 집합과 맵, 스택

### 문제 설명

<p>Bajtek wraz z kolegami założyli klub kinomana. Członkowie klubu chodzą do kin oglądać r&oacute;żne filmy, następnie spotykają się i opowiadają sobie obejrzane filmy. Opowieści są tak dokładne, że film z opowieści jest praktycznie taki sam, jak gdyby go oglądać.</p>

<p>Zbliża się festiwal filmowy &bdquo;Srebrne widnokręgi&rdquo;. Członkowie klubu mają zostać oddelegowani do oglądania film&oacute;w, tak aby łącznie obejrzeli je wszystkie. Sytuację utrudnia fakt, że każdy film na festiwalu odgrywany jest tylko jeden raz, w konkretnym przedziale czasu. Aby uznać film za obejrzany, trzeba go obejrzeć w całości, od początku do końca. Oczywiście w danym momencie członek klubu może oglądać tylko jeden film, jednak każdy jest w stanie skończyć oglądać jeden film i zacząć oglądać inny w tym samym momencie. Bilety na festiwal są drogie, a więc klub, szukając oszczędności, chce wysłać na festiwal jak najmniejszą liczbę członk&oacute;w.</p>

<p>Napisz program, kt&oacute;ry wczyta liczbę film&oacute;w oraz przedziały czasu, w kt&oacute;rych odgrywane będą poszczeg&oacute;lne filmy, wyznaczy najmniejszą liczbę członk&oacute;w klubu, kt&oacute;rych należy oddelegować na festiwal i wypisze wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 250 000), określająca liczbę film&oacute;w na festiwalu. W kolejnych N wierszach znajduje się opis film&oacute;w, po jednym w wierszu. Opis każdego składa się z dw&oacute;ch liczb naturalnych S<sub>i</sub>, T<sub>i</sub>, 1 &le; S<sub>i</sub> &lt; T<sub>i</sub> &le; 10<sup>9</sup>, oddzielonych pojedynczymi odstępami. Określają one, że i-ty film odgrywany będzie od S<sub>i</sub>-tej do T<sub>i</sub>-tej minuty festiwalu.</p>

### 출력

<p>W pierwszym wierszu wyjścia należy wypisać jedną liczbę naturalną R &ndash; najmniejszą możliwą liczbę członk&oacute;w wystarczających do obejrzenia wszystkich film&oacute;w na festiwalu. W kolejnych R wierszach należy podać dowolny spos&oacute;b osiągnięcia tego: w i + 1-szym wierszu należy wypisać liczbę naturalną F<sub>i</sub> określającą liczbę film&oacute;w jakie ma obejrzeć i-ty reprezentant klubu, następnie pojedynczy odstęp oraz ciąg F<sub>i</sub> liczb naturalnych M<sub>i,j</sub> pooddzielanych pojedynczymi odstępami &ndash; numery film&oacute;w oglądanych przez i-tego reprezentanta klubu.</p>