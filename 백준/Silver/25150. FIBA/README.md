# [Silver III] FIBA - 25150

[문제 링크](https://www.acmicpc.net/problem/25150)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 14, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

정렬

### 문제 설명

<p>U prvom krugu svjetskog prvenstva u ko&scaron;arci nastupa N timova. Oni su označeni brojevima od 1 do N. Igra se po principu &bdquo;svatko sa svakim&ldquo;, tj. svaki će tim odigrati po jednu utakmicu sa svakim drugim timom na prvenstvu. Rezultat utakmice zadaje se kao broj ko&scaron;eva tima s manjom oznakom nasuprot broju ko&scaron;eva tima s većom oznakom. Pobjednik utakmice je tim koji je dao vi&scaron;e ko&scaron;eva. Za pobjedu tim dobiva dva boda, a za poraz jedan bod. Nerije&scaron;en ishod meča nije moguć.</p>

<p>U prvom krugu prvenstva sudjeluje i Hrvatska. Ona je označena brojem H. Odredi i ispi&scaron;i koliko je bodova osvojila Hrvatska u prvom krugu natjecanja.</p>

<p>Pobjednik prvog kruga je tim koji je sakupio najvi&scaron;e bodova u susretima sa svim ostalim timovima. Ako vi&scaron;e timova ima isti, najveći broj bodova, tada je pobjednik onaj među njima koji je dao ukupno najvi&scaron;e ko&scaron;eva tijekom prvog kruga. Pobjednika će se uvijek moći odrediti na jedan od ovih dvaju načina. Odredi i ispi&scaron;i oznaku pobjednika prvog kruga natjecanja.</p>

<p>U drugi krug prvenstva prolazi prvih K timova na ljestvici poretka, tj. prvih K timova s najvi&scaron;e bodova osvojenih u prvom krugu natjecanja. U slučaju da dva ili vi&scaron;e timova imaju isti broj osvojenih bodova, tada je tim koji je postigao vi&scaron;e ko&scaron;eva bolje plasiran na ljestvici poretka. Izbor prvih K timova uvijek će biti moguć.</p>

<p>Timovi koji su pro&scaron;li u drugi krug prenose bodove osvojene u prvom krugu, ali samo one bodove koje su osvojili protiv timova koji su također pro&scaron;li u drugi krug. Odredi i ispi&scaron;i koliko su ukupno bodova timovi prenijeli u drugi krug natjecanja.</p>

### 입력

<p>U prvom retku nalaze se tri prirodna broja N, K i H (3 &le; K &lt; N &le; 25, H &le; N), brojevi iz teksta zadatka.</p>

<p>Rezultate utakmica prvog kruga zadajemo u obliku: prvo zadajemo rezultate utakmica tima s oznakom 1 redom sa svim timovima veće oznake, pa rezultate tima s oznakom 2 sa svim timovima veće oznake i tako sve do tima s oznakom N-1. Preciznije, u svakom retku nalaze se po dva broja K<sub>i</sub> i K<sub>j</sub> (0 &le; K<sub>i</sub>, K<sub>j</sub> &le; 100, pri čemu je i=1..N-1, a j=i+1..N).</p>

### 출력

<p>U prvi redak ispi&scaron;i prirodan broj, broj bodova koje je osvojila Hrvatska u prvom krugu.</p>

<p>U drugi redak ispi&scaron;i prirodan broj, oznaku pobjednika prvog kruga.</p>

<p>U treći redak ispi&scaron;i ukupan broj bodova koji su timovi prenijeli u drugi krug natjecanja.</p>

### 힌트

<p>Opis prvog test podatka: Na prvenstvu sudjeluju četiri tima, tri će proći u drugi krug. Rezultati prvog kruga su: T1(Hrvatska):T2=4:7, T1(Hrvatska):T3=8:2, T1(Hrvatska):T4=5:2, T2:T3=7:1, T2:T4=6:2, T3:T4=3:7. Nakon prvog kruga tim T2 bio je na prvom mjestu sa 6 bodova, T1(Hrvatska) na drugom s 5 bodova, T4 na trećem s 4 boda i T3 na posljednjem mjestu s 3 boda.</p>

<p>U drugi krug pro&scaron;li su timovi T2, T1 i T4. Svatko od njih prenio je bodove koje je u prvom krugu osvojio protiv tih timova, dok su se bodovi osvojeni protiv T3 brisali. Pa je tako T1 prenio 3 boda, T2 je prenio 4 boda, a T4 2 boda. Ukupan broj bodova koje su timovi prenijeli u drugi krug je 9 bodova.</p>