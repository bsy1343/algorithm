# [Bronze III] Pique Esconde - 30655

[문제 링크](https://www.acmicpc.net/problem/30655)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 276, 정답: 194, 맞힌 사람: 174, 정답 비율: 73.109%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Jo&atilde;o, que gosta de inform&aacute;tica, procura pensar em como seria um programa para automatizar tudo que ele faz no seu dia a dia. Maria o desafiou a fazer um programa que fosse &uacute;til de algum jeito para quando eles brincarem de pique esconde.</p>

<p>Jo&atilde;o teve uma ideia muito boa de um programa, mas como ele ainda est&aacute; em suas primeiras aulas de inform&aacute;tica, ainda n&atilde;o descobriu como implementar essa ideia. Assim, voc&ecirc; deve ajud&aacute;-lo. A ideia de Jo&atilde;o &eacute; numerar as crian&ccedil;as participando da brincadeira de 1 a n. O programa recebe como entrada o n&uacute;mero total de crian&ccedil;as e tamb&eacute;m o n&uacute;mero correspondente &#39;a crian&ccedil;a que est&aacute; procurando os demais participantes. Depois, o programa recebe uma lista com n &minus; 2 n&uacute;meros identificando as crian&ccedil;as que j&aacute; foram encontradas e deve responder qual a crian&ccedil;a que est&aacute; faltando.</p>

<p>Sua tarefa &eacute; implementar esse programa e ajudar Jo&atilde;o a mostrar para Maria que a inform&aacute;tica pode ser &uacute;til at&eacute; nas mais simples tarefas.</p>

### 입력

<p>A entrada &eacute; composta por diferentes casos de teste. A primeira linha de cada caso de teste cont&eacute;m n, o n&uacute;mero de crian&ccedil;as, e m, o n&uacute;mero da crian&ccedil;a que est&aacute; procurando as demais, 2 &le; n &le; 1000 e 1 &le; m &le; n. As n &minus; 2 linhas seguintes cont&eacute;m um inteiro cada representando as crian&ccedil;as que j&aacute; foram encontradas.</p>

<p>A entrada termina com n = m = 0. Essa linha n&atilde;o deve ser processada.</p>

### 출력

<p>Para cada caso de teste, seu programa deve imprimir uma linha contendo o n&uacute;mero da crian&ccedil;a que ainda n&atilde;o foi encontrada.</p>