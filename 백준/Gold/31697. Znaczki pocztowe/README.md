# [Gold V] Znaczki pocztowe - 31697

[문제 링크](https://www.acmicpc.net/problem/31697)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 30, 맞힌 사람: 24, 정답 비율: 64.865%

### 분류

수학, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Bajtazar swego czasu dorobił się pokaźnej kolekcji znaczk&oacute;w pocztowych. Nie interesuje się tym jednak tak bardzo jak za młodu, dlatego postanowił rozdać swoją kolekcję młodszym fascynatom filatelistyki. Chciałby jednak zrobić to możliwie sprawiedliwie, do czego potrzebuje Twojej pomocy.</p>

<p>Kolekcja Bajtzara składa się z n znaczk&oacute;w, z czego i-ty pochodzi z miasta a<sub>i</sub>. Dla ułatwienia miasta oznaczamy liczbami całkowitymi. Bajtazar zamierza umieścić w gazecie ogłoszenie o tym, że planuje rozdać swoją kolekcję. Jeśli zgłosi się do niego k chętnych, to każdemu z nich sprezentuje jakiś podzbi&oacute;r znaczk&oacute;w z zachowaniem pewnego warunku: każdy chętny będzie musiał otrzymać taki sam multizbi&oacute;r znaczk&oacute;w. Oznacza to, że dla każdych dw&oacute;ch chętnych i dla każdego miasta, oboje chętni muszą otrzymać taką samą liczbę znaczk&oacute;w z tego miasta. Może to w szczeg&oacute;lności oznaczać, że Bajtazar nie rozda żadnego znaczka.</p>

<p>Bajtazar nie wie, ilu dokładnie chętnych się zgłosi. W związku z tym dla każdej liczby k z zakresu od 1 do n musisz stwierdzić, ile maksymalnie znaczk&oacute;w może rozdać Bajtazar, jeśli zgłosi się do niego k chętnych.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita n (1 &le; n &le; 300 000), oznaczająca liczbę znaczk&oacute;w w kolekcji Bajtazara.</p>

<p>W drugim wierszu wejścia znajduje się n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, &middot; &middot; &middot; , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 10<sup>9</sup>) &ndash; numery miast, z kt&oacute;rych pochodzą kolejne znaczki Bajtazara.</p>

### 출력

<p>W jedynym wierszu wyjścia powinno znaleźć się n liczb oddzielonych pojedynczymi odstępami; k-ta z nich powinna być r&oacute;wna maksymalnej liczbie znaczk&oacute;w, kt&oacute;re może rozdać Bajtazar, jeśli zgłosi się do niego k chętnych.</p>

### 힌트

<p>Wyjaśnienie przykładu: Jeśli do Bajtazara zgłosi się jeden chętny, to Bajtazar może oddać mu wszystkie swoje znaczki.</p>

<p>Jeśli będzie dw&oacute;ch chętnych, to Bajtazar może im dać po dwa znaczki z miasta 1, po jednym znaczku z miasta 42 i po jednym znaczku z miasta 777, czyli w sumie 8 znaczk&oacute;w.</p>

<p>Jeśli będzie czterech chętnych, to Bajtazar może im dać po jednym znaczku z miasta 1.</p>

<p>Jeśli będzie więcej niż czterech chętnych, to Bajtazar nie będzie m&oacute;gł rozdać żadnych znaczk&oacute;w.</p>