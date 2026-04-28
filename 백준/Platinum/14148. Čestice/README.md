# [Platinum III] Čestice - 14148

[문제 링크](https://www.acmicpc.net/problem/14148)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 64 MB

### 통계

제출: 15, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

조합론, 다이나믹 프로그래밍, 수학, 정수론

### 문제 설명

<p>Mirko se preko veze zaposlio kao fizičar u Europskoj Organizaciji za Nuklearna Istraživanja (CERN) te je kao prvi zadatak dobio izradu nacrta za najnoviji ubrzivač čestica. Ubrzivač će imati točno N komora u kojima se na početku svakog pokusa nalazi po jedna čestica. Na svaku komoru se nastavlja točno jedna komora. Svake sekunde se sve čestice prebace iz komore u kojoj se trenutno nalaze u komoru koja se nju nastavlja. Primijetite da ako se na komoru A nastavlja komora B, nije nužno da na komoru B nastavlja komora A, iako je i to moguće. Za pokuse je izuzetno važno je da nakon K sekundi sve čestice budu u svojim početnim komorama.</p>

<p>Mirka zanima na koliko načina može napraviti nacrt za ubrzivač sa traženim svojstvima. Dva nacrta se razlikuju ukoliko postoji komora na koju se u ta dva nacrta nastavljaju različite komore. Kako nacrta može biti jako mnogo, potrebno je odrediti samo ostatak pri dijeljenju broja nacrta sa modulom M.</p>

<p>Napomena: Komora se može nastavljati na samu sebe.&nbsp;</p>

### 입력

<p>U prvom retku nalaze se brojevi N i K odvojeni razmakom, 1 &le; K &le; N &le; 30 000. Broj N predstavlja ukupan broj komora koje Mirko ima na raspolaganju za gradnju ubrzivača, a K je broj sekundi nakon kojeg sve čestice moraju biti u svojim početnim komorama.</p>

<p>U drugom retku nalazi se broj M, 1 &le; M &le; 10<sup>9</sup> , modul.&nbsp;</p>

### 출력

<p>U prvi i jedini redak izlaza potrebno je ispisati ostatak pri dijeljenju broja različitih nacrta s brojem M.&nbsp;</p>