# [Platinum III] VEZUV - 25537

[문제 링크](https://www.acmicpc.net/problem/25537)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 7, 맞힌 사람: 5, 정답 비율: 29.412%

### 분류

자료 구조, 그래프 이론, 트리, 방향 비순환 그래프, 위상 정렬, 플로이드–워셜, 트라이

### 문제 설명

<p>Članovi povjerenstva jednog regionalnog ICPC natjecanja nisu uspjeli osigurati prikladne uvjete za natjecanje pa su odlučili timove rangirati leksikografski. Dakle, pobjednikom će biti progla&scaron;en tim čije je ime leksikografski najmanje.</p>

<p>Junakinja ovog zadatka, Etna, voditeljica je tima čiji identitet ćemo sakriti, ali dovoljno je reći da se radi o timu čije ime počinje slovom &lsquo;Z&rsquo;, &scaron;to ga stavlja u prilično lo&scaron; položaj. Nakon dugotrajnih rasprava s povjerenstvom, Etna se uspjela izboriti za ne&scaron;to pravedniji način rangiranja timova. Nažalost, timovi će se i dalje rangirati leksikografski, ali će se promijeniti definicija leksikografskog poretka. Preciznije, povjerenstvo će nasumično odabrati neku permutaciju slova engleske abecede te će leksikografski poredak prirodno definirati pomoću te permutacije. Odnosno, poredak slova u permutaciji odgovarat će i njihovom leksikografskom poretku.</p>

<p>Etna je odmah izvadila svoj laptop i napisala program koji za svaki tim pronalazi neku permutaciju slova prema kojoj će upravo taj tim osvojiti natjecanje. Nažalost, program jo&scaron; ni dan danas nije zavr&scaron;io s izvođenjem. Pomozite Etni i napi&scaron;ite efikasniji program iste funkcionalnosti.</p>

### 입력

<p>U prvom je retku prirodan broj N koji predstavlja broj timova koji sudjeluju na natjecanju.</p>

<p>U sljedećih su N redaka imena timova koji sudjeluju na natjecanju. Ime svakog tima sastoji se od jedne riječi koja se pak sastoji od malih slova engleske abecede. Naravno, imena timova međusobno su različita.</p>

### 출력

<p>Za svaki tim, redom kojim su navedeni u ulaznim podatcima, potrebno je u zaseban redak ispisati permutaciju slova engleske abecede prema kojoj će taj tim osvojiti natjecanje. Ako ne postoji nijedna takva permutacija, potrebno je ispisati rijec &ldquo;nemoguce&rdquo;, a ako postoji vi&scaron;e takvih permutacija, dovoljno je ispisati bilo koju.</p>