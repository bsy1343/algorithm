# [Gold II] Matematika - 14114

[문제 링크](https://www.acmicpc.net/problem/14114)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 7, 맞힌 사람: 5, 정답 비율: 29.412%

### 분류

수학, 두 포인터

### 문제 설명

<p>Mali Igor nije uopće vježbao matematiku preko ljetnih praznika, pa je nekoliko dana prije početka nastave shvatio da se vi&scaron;e ne sjeća osnovnih matematičkih operacija. Sada gnjavi brata Davora da mu pomogne vježbati.</p>

<p>Kako bi vježbu učinio zanimljivom, Davor je rekao Igoru da zamisli cijeli broj. Zatim mu je nekoliko puta rekao da zami&scaron;ljenom broju doda, oduzme, pomnoži ga ili podijeli sa nekim drugim cijelim brojem. Pri operaciji dijeljenja, Igor uvijek koristi cjelobrojno dijeljenje (na primjer, pri dijeljenju broja -27 sa 10 rezultat je -2). Na kraju vježbe Igor na glas kaže konačni rezultat, a na Davoru je da pogodi koji je broj Igor na početku zamislio.</p>

<p>Napi&scaron;ite program koji će na temelju zadanih operacija i konačnog rezultata odrediti koliko ima različitih brojeva koje je Igor mogao zamisliti.&nbsp;</p>

### 입력

<p>U prvom redu nalazi se prirodni broj N (1 &le; N &le; 10), broj operacija.</p>

<p>U svakom od sljedećih N redova nalazi se po jedna operacija u jednom od četiri oblika: &ldquo;DODAJ x&rdquo;, &ldquo;ODUZMI x&rdquo;, &ldquo;POMNOZI SA x&rdquo;, &ldquo;PODIJELI SA x&rdquo;, pri čemu je x cijeli broj, 1 &le; x &le; 9.</p>

<p>U zadnjem redu nalazi se konačni rezultat cijeli broj R (-100 &le; R &le; 100).&nbsp;</p>

### 출력

<p>U prvi i jedini red potrebno je ispisati broj različitih brojeva koje je Igor mogao zamisliti.&nbsp;</p>

### 힌트

<p>Ne postoji nijedan cijeli broj koji pomnožen sa 5 daje 8.&nbsp;</p>