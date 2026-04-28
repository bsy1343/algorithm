# [Silver IV] Eurokulen - 25449

[문제 링크](https://www.acmicpc.net/problem/25449)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 53, 맞힌 사람: 23, 정답 비율: 92.000%

### 분류

구현, 정렬

### 문제 설명

<p>Na izboru za najbolji kulen Europe sudjeluje $N$ malih obiteljskih gospodarstava (OPG) označenih brojevima od jedan do $N$. Nakon predstavljanja i degustacije kulena, pristupa se glasanju. Svaki OPG-e rangira preostalih $N-1$ OPG-ova na način da najboljem kulenu po njihovom izboru dodijeli N-1 bodova, donajboljem $N-2$ bodova i tako sve do zadnjeg kojem dodjeljuje samo jedan bod.</p>

<p><strong>Pitanje #1</strong>: Odredi i ispi&scaron;i oznake OPG-ova čiji su kuleni zauzeli prvo, drugo i treće mjesto. Ako vi&scaron;e kulena ima isti broj bodova, prednost ima onaj s manjom oznakom.</p>

<p>Međutim, europski povjerenik za kulen, izvjesni K.M. iz Zagreba, dodatno pregledava ishod glasanja. Naime, Europa ne voli kada OPG-ovi razmjenjuju bodove, tj. kada OPG A da X bodova OPG-u B, a OPG B da X bodova OPG-u A. Kada povjerenik otkrije takvu situaciju, glasovi OPG-a A i OPG-a B se bri&scaron;u i ne broje se u određivanju nove liste najboljih kulena. Njihovi kuleni ostaju na listi, samo se njihovi glasovi bri&scaron;u.</p>

<p><strong>Pitanje #2</strong>: Odredi i ispi&scaron;i oznake OPG-ova čiji su kuleni zauzeli prvo, drugo i treće mjesto nakon brisanja bodova OPG-ova koji su razmjenjivali bodove. Ako vi&scaron;e kulena ima isti broj bodova, prednost ima onaj s manjom oznakom.</p>

### 입력

<p>U prvom je retku prirodan broj $N$ ($3 &le; N &le; 1000$), broj iz teksta zadatka.</p>

<p>U $i$-tom od sljedećih $N$ redaka je $N-1$ prirodnih brojeva $K_j$ ($1 &le; K_j &le; N-1$, $K_j &ne; i$), oznake kulena onim redom kako ih je OPG oznake $i$ rangirao.</p>

### 출력

<p>U prvi redak ispi&scaron;i tražene tri oznake OPG-ova, odgovor na prvo pitanje iz teksta zadatka.</p>

<p>U drugi redak ispi&scaron;i tražene tri oznake OPG-ova, odgovor na drugo pitanje iz teksta zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera: OPG 1 osvojio je dva boda, OPG 2 tri boda i OPG 3 četiri boda. OPG 1 dao je OPG-u 2 jedan bod, isto koliko je i OPG 2 dao njemu. Isto tako je OPG 2 dao OPG-u 3 dva boda, koliko i OPG 3 njemu. Zbog toga su obrisani bodovi koje su dodijelila sva tri OPG-a i nakon toga svi OPG-ovi imaju nula bodova pa je, zbog pravila o u slučaju dijeljenja bodova, poredak 1, 2, 3.</p>