# [Silver IV] Čuvar - 14157

[문제 링크](https://www.acmicpc.net/problem/14157)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 70, 정답: 58, 맞힌 사람: 43, 정답 비율: 86.000%

### 분류

구현, 브루트포스 알고리즘, 기하학, 피타고라스 정리

### 문제 설명

<p>Poznata tvrtka je vlasnik poslovne zgrade u sredi&scaron;tu Zagreba. Krov zgrade je ravan, te ima oblik kvadrata. Na krovu se nalazi nekoliko otvora koji su se pokazali kao veliki sigurnosni problem. Naime, u zadnjih mjesec dana dogodilo se nekoliko provala u zgradu, a provalnici su redovito provaljivali upravo kroz otvore na krovu.</p>

<p>Stoga je tvrtka odlučila na krov postaviti psa čuvara koji će paziti da netko ne bi poku&scaron;ao ući kroz otvore. Me&ntilde;utim, lokalni pet-shop im je podvalio vrlo nespretnog psa koji je prilikom prvog posjeta krovu nekoliko puta bio vrlo blizu toga da padne sa zgrade.</p>

<p>Zbog toga su odlučili staviti psa na lanac i to tako da:</p>

<ul>
	<li>lanac je učvr&scaron;ćen u točki sa cjelobrojnim koordinatama (ako je krov kvadrat dimenzija 10x10 metara, onda njegov jugozapadni vrh ima koordinate (0, 0), a sjeveroistočni vrh ima koordinate (10, 10))</li>
	<li>pas ne može pasti sa zgrade (no smije doći do samog ruba)</li>
	<li>pas može doći do sredi&scaron;ta svakog od otvora</li>
	<li>lanac ne može biti učvr&scaron;ćen u točki koja je sredi&scaron;te nekog otvora</li>
</ul>

<p>Odredite koordinate točke na krovu u kojoj lanac može biti učvr&scaron;ćen.&nbsp;</p>

### 입력

<p>U prvom retku ulaza je prirodni broj N &le; 100, broj test primjera koje će sadržavati ulazni podaci.</p>

<p>Slijede opisi N test primjera. Svaki opis započinje retkom u kojem se nalaze dva cijela broja S i H, odvojena jednim razmakom. Broj S je paran, 2 &le; S &le; 40; vrijedi i 1 &le; H &le; 50. Broj S predstavlja duljinu stranice krova u metrima, a H broj otvora na krovu.</p>

<p>Idućih H redaka sadrže po dva cijela broja X i Y, koordinate sredi&scaron;ta odgovarajućeg otvora. Sredi&scaron;ta otvora će uvijek biti u unutra&scaron;njosti krova (neće biti niti na njegovom rubu). Dva otvora se neće preklapati.&nbsp;</p>

### 출력

<p>Za svaki test primjer potrebno je ispisati jedan redak koji sadrži koordinate X i Y (odvojene jednim razmakom). Te koordinate predstavljaju točku u kojoj treba učvrstiti lanac tako da budu zadovoljeni uvjeti iz teksta zadatka. Ako postoji vi&scaron;e takvih točaka, ispi&scaron;ite onu koja ima najmanju X-koordinatu; ako je i dalje preostalo vi&scaron;e točaka, od tih preostalih ispi&scaron;ite onu koja ima najmanju Y-koordinatu.<br />
Ako tražena točka ne postoji, ispi&scaron;ite redak &quot;-1 -1&quot; kao odgovor na taj test primjer.&nbsp;</p>