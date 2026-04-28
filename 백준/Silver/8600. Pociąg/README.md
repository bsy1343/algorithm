# [Silver III] Pociąg - 8600

[문제 링크](https://www.acmicpc.net/problem/8600)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 11, 맞힌 사람: 10, 정답 비율: 47.619%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 집합과 맵

### 문제 설명

<p>Na pewną bajtocką wyspę co roku trafia duży transport surowc&oacute;w. Dostarczane są one do portu, skąd dalej rozwożone są pociągiem do wszystkich miast na całej wyspie. Miasta znajdują się tylko przy brzegu i są ponumerowane kolejno od $1$&nbsp;do $n$. Trasa pociągu prowadzi wok&oacute;ł całej wyspy przez wszystkie miasta.</p>

<p>Pociąg składa się z lokomotywy ciągnącej pewną liczbę wagon&oacute;w. W każdym wagonie przewożony jest inny rodzaj surowca. Ponadto, do każdego miasta dostarczany jest inny surowiec. Wagon&oacute;w jest dokładnie tyle co miast. Dotychczas wagony były zawsze tak ustawiane, że pociąg w każdym mieście odczepiał ostatni wagon i ruszał do następnego miasta. W ten spos&oacute;b wykonywał tylko jedno okrążenie. Niestety tym razem surowce zostały źle oznaczone i pomylono kolejność ustawienia wagon&oacute;w.</p>

<p>Maszynista zastanawia się, ile minimalnie okrążeń będzie musiał wykonać, aby rozwieźć wszystkie surowce do odpowiednich miast, wiedząc, że może zawsze odczepiać tylko ostatni wagon oraz nie może doczepiać już odczepionych. Stacją początkową i końcową jest miasto numer 1, w kt&oacute;rym r&oacute;wnież znajduje się port. Nowe okrążenie liczone jest wtedy, gdy pociąg wyruszy do miasta numer 2.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita $n$&nbsp;($2 &le; n &le; 1\,000\,000$), oznaczająca liczbę miast położonych na wyspie. W kolejnym wierszu znajduje się $n$&nbsp;liczb całkowitych $w_1, w_2, \dots , w_n$&nbsp;($1 &le; w_i &le; 1\,000\,000$, $w_i \ne w_j$&nbsp;dla $i \ne j$), przy czym $w_i$&nbsp;oznacza rodzaj surowca znajdującego się w $i$-tym wagonie od lokomotywy. W kolejnym wierszu znajduje się $n$&nbsp;parami r&oacute;żnych liczb całkowitych $m_1, m_2, \dots , m_n$, oznaczających surowce zamawiane przez miasta o numerach $1, 2, \dots , n$. Liczby w drugim i trzecim wierszu są pooddzielane pojedynczymi odstępami. Można założyć, że zbiory liczb $w_i$&nbsp;oraz $m_i$&nbsp;są takie same, tzn. $\{w_1, w_2, \dots , w_n\} = \{m_1, m_2, \dots , m_n\}$.</p>

### 출력

<p>W pierwszym i jedynym wierszu standardowego wyjścia powinna znaleźć się jedna liczba całkowita oznaczająca minimalną liczbę okrążeń, kt&oacute;re pozwolą rozwieźć wszystkie surowce do odpowiednich miast.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/8600.%E2%80%85Poci%C4%85g/c6bb7723.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/8600.%E2%80%85Poci%C4%85g/c6bb7723.png" data-original-src="https://upload.acmicpc.net/6a0c1af8-d717-4ad7-a9ef-39997fdac4ab/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;W pierwszym okrążeniu odczepiony zostaje tylko wagon przewożący surowiec numer 5, w drugim - wagon przewożący surowiec numer 4, wreszcie w trzecim, ostatnim okrążeniu odczepione zostają kolejno wagony przewożące surowce o numerach 3, 2, 1.</p>