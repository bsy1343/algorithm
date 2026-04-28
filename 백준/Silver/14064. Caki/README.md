# [Silver I] Caki - 14064

[문제 링크](https://www.acmicpc.net/problem/14064)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 17, 맞힌 사람: 15, 정답 비율: 75.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Mali Caki obožava utrke bolida Formule 1, a nova sezona upravo je počela. Pro&scaron;le je nedjelje Caki sjeo ispred &scaron;tale, izvukao antenu na svom radiju, usmjerio je u obližnji repetitor i pomno slu&scaron;ao prijenos utrke. I sve bi bilo krasno da se komentator utrke nije odlučio na&scaron;aliti sa svojim slu&scaron;ateljima tako da je na početku prijenosa najavio da će jedine informacije koje će prenositi u eter biti oznaka bolida koji prestiže bolid ispred sebe i to upravo u trenutku prestizanja. Staza na kojoj se utrka odvija je kružna, a pretpostavljamo da su svi bolidi stigli na cilj nakon &scaron;to su odvozili propisani broj krugova.</p>

<p>Iz dobivenih informacije odredite koji su bolidi zauzeli prvih &scaron;est mjesta na kraju utrke. Primijetite da je moguće da bolid prestigne druge bolide za cijeli krug ili vi&scaron;e krugova.</p>

### 입력

<p>U prvom redu nalaze se dva prirodna broja n i k, (2 &le; n &le; 1 000, 1 &le; k &le; 10 000) &mdash; broj bolida na stazi te broj prestizanja tijekom utrke. Bolidi su označeni brojevima od 1 do n, i to tako da je svaki bolid označen upravo onim brojem koji predstavlja njegovu startnu poziciju.</p>

<p>U svakom od sljedećih k redaka nalazi se po jedan prirodni broj x (1 &le; x &le; n) &mdash; oznaka bolida koji je prestigao bolid ispred sebe. Tih k brojeva poredani su upravo onim redoslijedom kako su se prestizanja i dogadala.</p>

### 출력

<p>U prvi red ispi&scaron;ite oznake bolida koji su zauzeli prvih &scaron;est mjesta na kraju utrke. Prvi broj je oznaka bolida koji je zauzeo prvo mjesto, . . . , &scaron;esti broj je oznaka bolida koji je zauzeo &scaron;esto mjesto, a ti su brojevi odvojeni s po jednim razmakom. Ako je broj bolida manji od &scaron;est, potrebno je ispisati točno onoliko brojeva koliko je bolida sudjelovalo u utrci.</p>