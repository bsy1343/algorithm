# [Silver I] HNL - 14104

[문제 링크](https://www.acmicpc.net/problem/14104)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

구현, 자료 구조, 브루트포스 알고리즘, 정렬, 집합과 맵, 시뮬레이션

### 문제 설명

<p>Mirka jako zanima nogomet, a najvi&scaron;e voli pratiti 1. Hrvatsku nogometnu ligu. Liga se sastoji od N nogometnih klubova</p>

<p>U njoj su klubovi rangirani prema broju osvojenih bodova, a oni s jednakim brojem bodova poredani su abecedno.</p>

<p>U ligi je preostalo jo&scaron; jedno kolo. Budući da je puno klubova na maloj bodovnoj udaljenosti, Mirka zanima koji svi klubovi imaju mogućnost osvojiti naslov. Angažirao je vas kao programere kako biste mu pomogli odgovoriti na to pitanje.</p>

<p>Zadana vam je trenutna tablica lige i parovi posljednjeg kola. Svaki tim sudjeluje u točno jednoj utakmici. Ako utakmica neka dva tima zavr&scaron;i nerije&scaron;eno, oba tima dobivaju po 1 bod. Inače, pobjednik dobiva 3 boda, a poraženi 0 bodova.&nbsp;</p>

### 입력

<p>U prvom retku prirodan broj N (1 &le; N &le; 20), broj nogometnih klubova u 1. HNL. Broj N je paran.</p>

<p>U sljedećih N redaka, u svakom retku se nalaze naziv kluba i broj bodova, odvojeni razmakom.</p>

<p>Naziv kluba je jedna riječ koja se sastoji od velikih slova engleske abecede. Ne postoje dva kluba istog imena. Broj bodova je nenegativan cijeli broj manji od 100.</p>

<p>Klubovi su poredani od boljih prema lo&scaron;ijim, kao &scaron;to je opisano u tekstu.</p>

<p>U svakom od sljedećih N/2 redaka nalazi se opis utakmice. Opis utakmice zadan je u formatu: &quot;Tim1 &ndash; Tim2&quot;, gdje Tim1 i Tim2 predstavljaju imena klubova koji igraju tu utakmicu.&nbsp;</p>

### 출력

<p>Ispi&scaron;ite imena svih klubova za koje postoji scenarij u kojem osvajaju naslov prvaka. Imena ispi&scaron;ite u abecednom poretku.&nbsp;</p>

### 힌트

<p>Ako Dinamo pobijedi Zadar, a Marsonia i Vinogradar odigraju nerije&scaron;eno, Dinamo osvaja naslov jer ima jednako bodova kao i Marsonia, te Vinogradar, ali je abecedno ispred njih. U slučaju da utakmica Marsonia &ndash; Vinogradar ne zavr&scaron;i nerije&scaron;eno, pobjednik osvaja naslov.</p>

<p>Jedino Zadar ne može nikako osvojiti naslov. Primijetite da, ako Zadar pobijedi Dinamo, a Marsonia i Vinogradar odigraju nerije&scaron;eno, tada je Zadar izjednačen po broju bodova s Marsonijom i Vinogradarom, ali ne osvaja naslov jer je abecedno iza njih.</p>