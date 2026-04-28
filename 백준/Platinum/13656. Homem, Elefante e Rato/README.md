# [Platinum III] Homem, Elefante e Rato - 13656

[문제 링크](https://www.acmicpc.net/problem/13656)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 17, 맞힌 사람: 16, 정답 비율: 72.727%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>Um jogo muito popular na Nlog&ocirc;nia &eacute; o Homem, Elefante e Rato. Ele &eacute; tipicamente jogado com apenas dois jogadores, e funciona da seguinte forma: cada jogador secretamente escolhe um dos tr&ecirc;s s&iacute;mbolos e, ap&oacute;s uma contagem regressiva, ambos revelam simultaneamente o s&iacute;mbolo escolhido atrav&eacute;s de sinais manuais, estendendo &agrave; sua frente uma das m&atilde;os sinalizando sua escolha.</p>

<p>O Homem &eacute; representado pela m&atilde;o fechada, como a cabe&ccedil;a de um homem. O Elefante &eacute; representado pela m&atilde;o aberta, exibindo os cinco dedos, como a pata do elefante nlogonense. Por fim, o Rato &eacute; representado pela m&atilde;o fechada, com o dedo indicador e o dedo m&eacute;dio esticados, como as orelhas do pequeno animal.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13656.%E2%80%85Homem%2C%E2%80%85Elefante%E2%80%85e%E2%80%85Rato/2532cecb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13656.%E2%80%85Homem%2C%E2%80%85Elefante%E2%80%85e%E2%80%85Rato/2532cecb.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13656/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%206.12.11.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:103px; width:279px" /><br />
&nbsp;</p>

<p>Figura 1: Os tr&ecirc;s s&iacute;mbolos do jogo Homem, Elefante e Rato.</p>

<p>Para determinar o vencedor &eacute; muito simples: o Homem sempre perde para o Elefante (pois &eacute; esmagado debaixo de sua pata), o Elefante sempre perde para o Rato (pois tem medo dele e foge correndo) e o Rato sempre perde para o Homem (que espalha ratoeiras para captur&aacute;-lo). Se dois jogadores utilizarem o mesmo s&iacute;mbolo, ocorre um empate e joga-se novamente.</p>

<p>Os habitantes da Nlog&ocirc;nia, que s&atilde;o estrategistas natos de Homem, Elefante e Rato, utilizam a seguinte t&eacute;cnica no campeonato nacional, realizado todos os anos: come&ccedil;am sempre jogando Homem at&eacute; o momento em que este s&iacute;mbolo causa empates com a maioria dos oponentes. Eles ent&atilde;o trocam sua estrat&eacute;gia para o s&iacute;mbolo que ganha daquele que usavam anteriormente. Assim, os jogadores v&atilde;o mudar de Homem para Elefante, depois para Rato, depois de volta a Homem.</p>

<p>Para auxiliar um famoso competidor estrangeiro de um jogo com uma certa similaridade com este jogo de Homem, Elefante e Rato, voc&ecirc; ir&aacute; desenvolver um programa que contabiliza quantos jogadores ir&atilde;o utilizar cada s&iacute;mbolo.</p>

<p>Suponha que todos os N jogadores s&atilde;o dispostos em fila e identificados pela sua posi&ccedil;&atilde;o, de 1 a N. Seu programa dever&aacute; processar M comandos, de dois tipos: mudan&ccedil;a de s&iacute;mbolo e contar a frequ&ecirc;ncia dos s&iacute;mbolos. Ambos os comandos recebem um intervalo cont&iacute;guo de jogadores na fila a serem considerados.</p>

### 입력

<p>A entrada &eacute; composta por diversos casos de teste. Cada caso de teste come&ccedil;a com uma linha contendo dois inteiros N (1 &le; N &le; 10<sup>5</sup>) ​​e M (0 &le; M &le; 10<sup>6</sup>)&nbsp;​que representam, respectivamente, o n&uacute;mero de jogadores no campeonato e o n&uacute;mero de opera&ccedil;&otilde;es.</p>

<p>As pr&oacute;ximas M linhas cont&ecirc;m cada uma a descri&ccedil;&atilde;o de uma opera&ccedil;&atilde;o. Opera&ccedil;&otilde;es de mudan&ccedil;a de estrat&eacute;gia ser&atilde;o representadas por uma linha da forma &quot;M A B&quot; onde A (1 &le; A) e B (A &le; B &le; N) s&atilde;o inteiros. Os jogadores cuja estrat&eacute;gias ser&atilde;o alteradas s&atilde;o aqueles cuja posi&ccedil;&atilde;o na fila est&aacute; entre A e B, inclusive.</p>

<p>Opera&ccedil;&otilde;es de contagem ser&atilde;o representadas por uma linha da forma &quot;C A B&quot; onde A e B s&atilde;o inteiros representando o intervalo de jogadores que dever&atilde;o ser considerados na contagem. Levaremos em conta os jogadores cuja posi&ccedil;&atilde;o na fila est&aacute; entre A e B, inclusive.</p>

### 출력

<p>Para cada opera&ccedil;&atilde;o de contagem, imprima uma linha contendo tr&ecirc;s inteiros indicando respectivamente o n&uacute;mero de s&iacute;mbolos Homem, Elefante e Rato que s&atilde;o usados pelos jogadores no intervalo dado.</p>

<p>Imprima tamb&eacute;m uma linha em branco ap&oacute;s cada caso de teste, inclusive ap&oacute;s o &uacute;ltimo caso de teste da entrada.</p>