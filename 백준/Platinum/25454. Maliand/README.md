# [Platinum III] Maliand - 25454

[문제 링크](https://www.acmicpc.net/problem/25454)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

수학, 정수론, 해 구성하기, 비둘기집 원리

### 문제 설명

<p>Braća Maliand, Adrian i Vedran, slobodno vrijeme provode igrajući računalne igre na obiteljskom računalu. Pritom su vrlo strastveni pa stvari nerijetko izmaknu kontroli, &scaron;to ima vrlo negativan utjecaj na zdravlje njihove majke. Njihova majka je inače umjetnica, a umjetnica mora biti zdrava. Stoga je odlučila uvesti raspored kojim će za svakog brata propisati koje dane u tjednu smije provesti igrajući se na računalu.</p>

<p>Budući da su Maliandi umjetnička obitelj, odlučili su da se njihov tjedan sastoji od $N$ uzastopnih dana. Majka će dopustiti Adrianu da provede točno $K$ dana tjedno igrajući igre, dok će Vedranu dopustiti da provede točno $L$ dana tjedno igrajući igre. Rasporede će im uručiti već danas, a Adrian i Vedran će ih se pridržavati od sutra.</p>

<p>Kako ne bi ispala prestroga prema svojim sinovima, odlučila im je dopustiti da se počnu pridržavati rasporeda počev&scaron;i od proizvoljnog dana napisanog na rasporedu. Naravno, nakon toga se strogo moraju pridržavati rasporeda redom kako pi&scaron;e, uz pretpostavku da se raspored periodički ponavlja u beskonačnost.</p>

<p>Primjerice, pretpostavimo da je $N = 3$, $K = 2$, te da je Adrian dobio raspored $(1, 0, 1)$, gdje $1$ označava da se taj dan smije igrati na računalu, a $0$ označava da ne smije. Ako se Adrian odlući pridržavati rasporeda od drugog napisanog dana, to znaći da se sutra neće igrati, pa će se iduća dva dana igrati, pa se opet jedan dan neće igrati, . . .</p>

<p>Gospođa Maliand je svjesna da će Adrian i Vedran biti najsretniji (i najglasniji) one dane kada se obojica mogu igrati na računalu, te zaključuje da će odabrati početak pridržavanja rasporeda tako da maksimiziraju broj takvih dana. S druge strane, ona će tada biti najmanje sretna, pa želi napraviti takve rasporede da broj dana kada se obojica mogu igrati na računalu bude najmanji mogući uz pretpostavku da će Adrian i Vedran početak pridržavanja rasporeda odabrati tako da taj broj maksimiziraju.</p>

<p>Pomozite gospođi Maliand odrediti rasporede koji će minimizirati broj dana u tjednu kada će se oba dječaka smjeti igrati na računalu.</p>

### 입력

<p>U prvom su retku brojevi $N$, $K$ i $L$ iz teksta zadatka ($0 &le; K, L &le; N$).</p>

### 출력

<p>U prvi redak ispi&scaron;ite broj dana u tjednu kada će se oba dječaka smjeti igrati na računalu ako gospođa Maliand optimalno odredi rasporede.</p>

<p>U drugi redak ispi&scaron;ite Adrianov raspored u obliku binarnog stringa duljine $N$ koji sadrži $K$ jedinica. Pritom, znamenka $1$ označava da se Adrian taj dan smije igrati na računalu, dok znamenka $0$ označava suprotno.</p>

<p>U treći redak ispi&scaron;ite Vedranov raspored u obliku binarnog stringa duljine $N$ koji sadrži $L$ jedinica. Interpretacija ovog ispisa analogna je interpretaciji Adrianovog rasporeda iz prethodnog odlomka.</p>

<p>Ako postoji vi&scaron;e točnih rje&scaron;enja, ispi&scaron;ite bilo koje.</p>

### 힌트

<p>Poja&scaron;njenje prvog probnog primjera: Ako se i Adrian i Vedran odluče pridržavati rasporeda od prvog napisanog dana, tada će se obojica na računalu igrati trećeg i petog dana (počev&scaron;i od sutra). Može se pokazati da gospođa Maliand ne može napraviti bolje rasporede.</p>

<p>Poja&scaron;njenje drugog probnog primjera: Budući da se Vedran uopće ne snije igrati na računalu, rje&scaron;enje je $0$ neovisno o Adrianovom rasporedu i njeogovoj odluci o početku pridržavanja rasporda.</p>

<p>Poja&scaron;njenje trećeg probnog primjera: Ako se Adrian odluči pridržavati rasporeda od prvog napisanog dana, a Vedran od četvrtog napisanog dana, tada će se obojica na računalu igrati četvrtog, petog, osmog, devetog i desetg dana (počev&scaron;i od sutra). Može se pokazati da gospođa Maliand ne može napraviti bolje rasporede.</p>