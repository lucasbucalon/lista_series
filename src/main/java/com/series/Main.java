package com.series;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  private static ArrayList<Series> seriesList = new ArrayList<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.println("\n=== Series Management System ===");
      System.out.println("1. Listar todas as séries");
      System.out.println("2. Adicionar nova série");
      System.out.println("3. Atualizar série");
      System.out.println("4. Excluir série");
      System.out.println("5. Mostrar informações do aluno");
      System.out.println("6. Sair");

      int choice = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer

      switch (choice) {
        case 1:
          listSeries();
          break;
        case 2:
          addSeries();
          break;
        case 3:
          updateSeries();
          break;
        case 4:
          deleteSeries();
          break;
        case 5:
          showStudentInfo();
          break;
        case 6:
          System.out.println("Adeus!");
          return;
        default:
          System.out.println("Opção inválida!");
      }
    }
  }

  private static void listSeries() {
    if (seriesList.isEmpty()) {
      System.out.println("Nenhuma série disponível.");
    } else {
      for (Series series : seriesList) {
        System.out.println(series);
      }
    }
  }

  private static void addSeries() {
    System.out.println("Digite o nome da série: ");
    String name = scanner.nextLine();
    System.out.println("Insira o gênero da série: ");
    String genre = scanner.nextLine();
    seriesList.add(new Series(name, genre));
    System.out.println("Série adicionada com sucesso!");
  }

  private static void updateSeries() {
    System.out.println("Digite o nome da série a ser atualizada: ");
    String name = scanner.nextLine();
    for (Series series : seriesList) {
      if (series.getName().equalsIgnoreCase(name)) {
        System.out.println("Insira um novo gênero: ");
        String newGenre = scanner.nextLine();
        series.setGenre(newGenre);
        System.out.println("Série atualizada com sucesso!");
        return;
      }
    }
    System.out.println("Série não encontrada.");
  }

  private static void deleteSeries() {
    System.out.println("Digite o nome da série a ser excluída: ");
    String name = scanner.nextLine();
    for (Series series : seriesList) {
      if (series.getName().equalsIgnoreCase(name)) {
        seriesList.remove(series);
        System.out.println("Série excluída com sucesso!");
        return;
      }
    }
    System.out.println("Série não encontrada.");
  }

  private static void showStudentInfo() {
    System.out.println("Nome do aluno: Lucas Bucalon");
    System.out.println("RA: 12428458");
  }
}