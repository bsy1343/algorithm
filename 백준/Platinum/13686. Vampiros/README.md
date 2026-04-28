# [Platinum III] Vampiros - 13686

[문제 링크](https://www.acmicpc.net/problem/13686)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 13, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

자료 구조, 다이나믹 프로그래밍, 수학, 확률론, 희소 배열

### 문제 설명

<p>Felipinho est&aacute; empolgado com seu novo jogo de RPG sobre guerras entre cl&atilde;s de vampiros. Nesse jogo ele representa um personagem de um vampiro e constantemente entra em conflito contra vampiros de outros cl&atilde;s. Tais batalhas s&atilde;o realizadas com base nas caracter&iacute;sticas de cada personagem envolvido e com a ajuda de um dado comum de seis faces.</p>

<p>Por simplicidade, vamos considerar apenas as lutas entre dois vampiros, vampiro 1 e vampiro 2. Cada um possui uma energia vital (chamaremos de&nbsp;EV<sub>1</sub>&nbsp;e&nbsp;EV<sub>2</sub>&nbsp;respectivamente) e, al&eacute;m disso, s&atilde;o determinadas uma for&ccedil;a de ataque&nbsp;AT&nbsp;e uma capacidade de dano&nbsp;D.</p>

<p>O combate &eacute; realizado em turnos da maneira descrita a seguir. A cada turno um dado &eacute; rolado, se o valor obtido for menor do que ou igual a&nbsp;AT, o vampiro 1 venceu o turno, caso contr&aacute;rio o vampiro 2 &eacute; quem venceu. O vencedor suga energia vital do advers&aacute;rio igual ao valor&nbsp;D, ou seja,&nbsp;D&nbsp;pontos de&nbsp;EV&nbsp;s&atilde;o diminu&iacute;dos do perdedor e acrescentados ao vencedor. O combate segue at&eacute; que um dos vampiros fique com&nbsp;EV&nbsp;igual a ou menor do que zero.</p>

<p>Por exemplo, suponhamos que&nbsp;EV<sub>1</sub>=7,&nbsp;EV<sub>2</sub>=5,&nbsp;AT=2&nbsp;and&nbsp;D=4. Rola-se o dado e o valor obtido foi 3. Nesse caso, o vampiro 2 venceu o turno e, portanto, 4 pontos de EV s&atilde;o diminu&iacute;dos do vampiro 1 (EV<sub>1</sub>) e acrescentados ao vampiro 2 (EV<sub>2</sub>) Sendo assim, os novos valores seriam&nbsp;EV<sub>1</sub>=3&nbsp;e&nbsp;EV<sub>2</sub>=9. Observe que se no pr&oacute;ximo turno o vampiro 2 ganhar novamente, o combate ir&aacute; terminar.</p>

<p>Os valores de AT e D s&atilde;o constantes durante todo o combate, apenas&nbsp;EV<sub>1</sub>&nbsp;e&nbsp;EV<sub>2</sub>&nbsp;variam.</p>

<p>Apesar de gostar muito do jogo, Felipinho acha que os combates est&atilde;o muito demorados e e gostaria de conhecer de antem&atilde;o a probabilidade de vencer, para saber se vale a pensa lutar. Assim, ele pediu que voc&ecirc; escrevesse um programa que, dados os valores iniciais de&nbsp;EV<sub>1</sub>,&nbsp;EV<sub>2</sub>, al&eacute;m de&nbsp;AT&nbsp;e&nbsp;D, calculasse a probabilidade de o vampiro 1 vencer o combate.</p>

### 입력

<p>A entrada consiste de v&aacute;rios casos de teste. Cada caso de teste consiste de uma &uacute;nica linha, contendo 4 inteiros&nbsp;EV<sub>1</sub>,&nbsp;EV<sub>2</sub>,&nbsp;AT&nbsp;e&nbsp;D&nbsp;separados por espa&ccedil;os (1 &le;&nbsp;EV<sub>1</sub>,&nbsp;EV<sub>2</sub>&nbsp;&le; 10,&nbsp;1 &le;&nbsp;AT&nbsp;&le; 5&nbsp;and&nbsp;1 &le;&nbsp;D&nbsp;&le; 10).</p>

<p>O final da entrada &eacute; indicado por uma linha contendo quatro zeros, separados por espa&ccedil;os.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve imprimir uma &uacute;nica linha. A linha deve conter apenas um n&uacute;mero real, escrito com precis&atilde;o de uma casa decimal, representando, em termos de percentagem, a probabilidade de o vampiro 1 vencer o combate.</p>